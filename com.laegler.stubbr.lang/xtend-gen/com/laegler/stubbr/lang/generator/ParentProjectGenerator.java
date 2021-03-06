package com.laegler.stubbr.lang.generator;

import com.laegler.stubbr.lang.generator.AbstractProjectGenerator;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.stubbrLang.ChapterProjectStructure;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import templates.AbstractTemplate;
import templates._common.IntellijProjectImlFileBase;
import templates._common.ReadmeMdTemplateBase;
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase;
import templates.parent.EclipseDotClasspathTemplate;
import templates.parent.EclipseDotProjectTemplate;
import templates.parent.PomXmlTemplate;

/**
 * Project Generator for parent project
 */
@SuppressWarnings("all")
public class ParentProjectGenerator extends AbstractProjectGenerator {
  private void initProject() {
    boolean _isActive = this.isActive();
    if (_isActive) {
      Project _project = new Project(this.stubbr);
      this.setProject(_project);
      Project _project_1 = this.getProject();
      StringConcatenation _builder = new StringConcatenation();
      Stubb _stubb = null;
      if (this.stubbr!=null) {
        _stubb=this.stubbr.getStubb();
      }
      String _name = null;
      if (_stubb!=null) {
        _name=_stubb.getName();
      }
      String _lowerCase = null;
      if (_name!=null) {
        _lowerCase=_name.toLowerCase();
      }
      _builder.append(_lowerCase, "");
      _builder.append("-parent");
      _project_1.setName(_builder.toString());
      Project _project_2 = this.getProject();
      Stubb _stubb_1 = null;
      if (this.stubbr!=null) {
        _stubb_1=this.stubbr.getStubb();
      }
      String _packageName = null;
      if (_stubb_1!=null) {
        _packageName=_stubb_1.getPackageName();
      }
      String _lowerCase_1 = null;
      if (_packageName!=null) {
        _lowerCase_1=_packageName.toLowerCase();
      }
      _project_2.setBasePackage(_lowerCase_1);
      Project _project_3 = this.getProject();
      _project_3.setProjectType(ProjectType.PARENT);
      Project _project_4 = this.getProject();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("/");
      {
        Stubb _stubb_2 = null;
        if (this.stubbr!=null) {
          _stubb_2=this.stubbr.getStubb();
        }
        ChapterProjectStructure _structure = null;
        if (_stubb_2!=null) {
          _structure=_stubb_2.getStructure();
        }
        boolean _isIsNestedParent = _structure.isIsNestedParent();
        boolean _not = (!_isIsNestedParent);
        if (_not) {
          Project _project_5 = this.getProject();
          String _name_1 = _project_5.getName();
          _builder_1.append(_name_1, "");
          _builder_1.append("/");
        }
      }
      _project_4.setRelativePath(_builder_1.toString());
      Project _project_6 = this.getProject();
      _project_6.setCanonicalName("Parent project");
      Project _project_7 = this.getProject();
      _project_7.setDocumentation("This project keeps the deployable enterprise archive (EAR)");
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Generating Project: ");
      Project _project_8 = this.getProject();
      String _name_2 = null;
      if (_project_8!=null) {
        _name_2=_project_8.getName();
      }
      _builder_2.append(_name_2, "");
      this.log.info(_builder_2.toString());
    }
  }
  
  /**
   * Generate persistence project
   */
  @Override
  public Project prepare() {
    Project _xblockexpression = null;
    {
      this.initProject();
      Project _project = this.getProject();
      List<AbstractTemplate> _files = null;
      if (_project!=null) {
        _files=_project.getFiles();
      }
      if (_files!=null) {
        Project _project_1 = this.getProject();
        ReadmeMdTemplateBase _readmeMdTemplateBase = new ReadmeMdTemplateBase(this.stubbr, _project_1);
        Project _project_2 = this.getProject();
        IntellijProjectImlFileBase _intellijProjectImlFileBase = new IntellijProjectImlFileBase(this.stubbr, _project_2);
        Project _project_3 = this.getProject();
        EclipseDotProjectTemplate _eclipseDotProjectTemplate = new EclipseDotProjectTemplate(this.stubbr, _project_3);
        Project _project_4 = this.getProject();
        EclipseDotClasspathTemplate _eclipseDotClasspathTemplate = new EclipseDotClasspathTemplate(this.stubbr, _project_4);
        Project _project_5 = this.getProject();
        EclipseCoreResourcesPrefsTemplateBase _eclipseCoreResourcesPrefsTemplateBase = new EclipseCoreResourcesPrefsTemplateBase(this.stubbr, _project_5);
        Project _project_6 = this.getProject();
        PomXmlTemplate _pomXmlTemplate = new PomXmlTemplate(this.stubbr, _project_6);
        _files.addAll(
          Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_readmeMdTemplateBase, _intellijProjectImlFileBase, _eclipseDotProjectTemplate, _eclipseDotClasspathTemplate, _eclipseCoreResourcesPrefsTemplateBase, _pomXmlTemplate)));
      }
      _xblockexpression = this.getProject();
    }
    return _xblockexpression;
  }
  
  private boolean isActive() {
    return true;
  }
}
