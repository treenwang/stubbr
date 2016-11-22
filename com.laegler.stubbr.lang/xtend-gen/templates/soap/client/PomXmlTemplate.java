package templates.soap.client;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates._common.PomXmlTemplateBase;

/**
 * File Generator for Maven project object model (pom.xml)
 */
@SuppressWarnings("all")
public class PomXmlTemplate extends PomXmlTemplateBase {
  public PomXmlTemplate(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setDocumentation("Maven project object model (pom.xml)");
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    String _parentSection = this.getParentSection();
    _builder.append(_parentSection, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<artifactId>");
    Project _project = this.getProject();
    String _name = null;
    if (_project!=null) {
      _name=_project.getName();
    }
    _builder.append(_name, "");
    _builder.append("</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("<name>");
    String _projectName = this.getProjectName();
    _builder.append(_projectName, "");
    _builder.append("</name>");
    _builder.newLineIfNotEmpty();
    _builder.append("<packaging>");
    Project _project_1 = this.getProject();
    String _packaging = null;
    if (_project_1!=null) {
      _packaging=_project_1.getPackaging();
    }
    _builder.append(_packaging, "");
    _builder.append("</packaging>");
    _builder.newLineIfNotEmpty();
    _builder.append("<description>");
    Project _project_2 = this.getProject();
    String _documentation = null;
    if (_project_2!=null) {
      _documentation=_project_2.getDocumentation();
    }
    _builder.append(_documentation, "");
    _builder.append("</description>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Project internal -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>${project.groupId}</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>");
    StubbrRegistry _stubbr = this.getStubbr();
    Stubb _stubb = null;
    if (_stubbr!=null) {
      _stubb=_stubbr.getStubb();
    }
    String _name_1 = null;
    if (_stubb!=null) {
      _name_1=_stubb.getName();
    }
    String _lowerCase = null;
    if (_name_1!=null) {
      _lowerCase=_name_1.toLowerCase();
    }
    _builder.append(_lowerCase, "\t\t");
    _builder.append("-common</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<version>${project.version}</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>${project.groupId}</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>");
    StubbrRegistry _stubbr_1 = this.getStubbr();
    Stubb _stubb_1 = null;
    if (_stubbr_1!=null) {
      _stubb_1=_stubbr_1.getStubb();
    }
    String _name_2 = null;
    if (_stubb_1!=null) {
      _name_2=_stubb_1.getName();
    }
    String _lowerCase_1 = null;
    if (_name_2!=null) {
      _lowerCase_1=_name_2.toLowerCase();
    }
    _builder.append(_lowerCase_1, "\t\t");
    _builder.append("-model</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<version>${project.version}</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>${project.groupId}</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>");
    StubbrRegistry _stubbr_2 = this.getStubbr();
    Stubb _stubb_2 = null;
    if (_stubbr_2!=null) {
      _stubb_2=_stubbr_2.getStubb();
    }
    String _name_3 = null;
    if (_stubb_2!=null) {
      _name_3=_stubb_2.getName();
    }
    String _lowerCase_2 = null;
    if (_name_3!=null) {
      _lowerCase_2=_name_3.toLowerCase();
    }
    _builder.append(_lowerCase_2, "\t\t");
    _builder.append("-persistence</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<version>${project.version}</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>${project.groupId}</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>");
    StubbrRegistry _stubbr_3 = this.getStubbr();
    Stubb _stubb_3 = null;
    if (_stubbr_3!=null) {
      _stubb_3=_stubbr_3.getStubb();
    }
    String _name_4 = null;
    if (_stubb_3!=null) {
      _name_4=_stubb_3.getName();
    }
    String _lowerCase_3 = null;
    if (_name_4!=null) {
      _lowerCase_3=_name_4.toLowerCase();
    }
    _builder.append(_lowerCase_3, "\t\t");
    _builder.append("-business</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<version>${project.version}</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>${project.groupId}</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>");
    StubbrRegistry _stubbr_4 = this.getStubbr();
    Stubb _stubb_4 = null;
    if (_stubbr_4!=null) {
      _stubb_4=_stubbr_4.getStubb();
    }
    String _name_5 = null;
    if (_stubb_4!=null) {
      _name_5=_stubb_4.getName();
    }
    String _lowerCase_4 = null;
    if (_name_5!=null) {
      _lowerCase_4=_name_5.toLowerCase();
    }
    _builder.append(_lowerCase_4, "\t\t");
    _builder.append("-soap-server</artifactId>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<version>${project.version}</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.wildfly.bom</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>wildfly-javaee7-with-tools</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<version>${wildfly.bom.version}</version>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<type>pom</type>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>javax.enterprise</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>cdi-api</artifactId>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.jboss.spec.javax.ejb</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>jboss-ejb-api_3.2_spec</artifactId>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.jboss.spec.javax.annotation</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>jboss-annotations-api_1.2_spec</artifactId>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.jboss.resteasy</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>resteasy-jaxrs</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<version>3.1.0.Beta1</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>io.rest-assured</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>rest-assured</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<version>3.0.0</version>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.eclipse.xtend</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>org.eclipse.xtend.lib</artifactId>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.slf4j</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>slf4j-api</artifactId>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>joda-time</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>joda-time</artifactId>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>com.google.code.gson</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>gson</artifactId>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>junit</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>junit</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.mockito</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>mockito-all</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>org.powermock</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>powermock-api-mockito</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>info.cukes</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>cucumber-core</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>info.cukes</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>cucumber-java</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>info.cukes</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>cucumber-junit</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dependency>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<groupId>info.cukes</groupId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<artifactId>gherkin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<scope>test</scope>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dependency>");
    _builder.newLine();
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<build>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<finalName>${project.artifactId}</finalName>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<plugins>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<plugin>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<groupId>org.apache.maven</groupId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<artifactId>maven-war-plugin</artifactId>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<version>${war.plugin.version}</version>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<configuration>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<failOnMissingWebXml>false</failOnMissingWebXml>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<webXml>src/main/webapp/WEB-INF/web.xml</webXml>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</configuration>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</plugin>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</plugins>");
    _builder.newLine();
    _builder.append("</build>");
    _builder.newLine();
    return _builder.toString();
  }
}
