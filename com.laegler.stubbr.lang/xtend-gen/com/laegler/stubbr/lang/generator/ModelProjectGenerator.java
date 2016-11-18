package com.laegler.stubbr.lang.generator;

import com.laegler.stubbr.lang.generator.AbstractProjectGenerator;
import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.ProjectType;
import com.laegler.stubbr.lang.stubbrLang.ChapterPersistence;
import com.laegler.stubbr.lang.stubbrLang.Entity;
import com.laegler.stubbr.lang.stubbrLang.Stubb;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import templates.AbstractTemplate;
import templates._common.DotGitignoreTemplateBase;
import templates._common.EclipseDotClasspathTemplateBase;
import templates._common.IntellijProjectImlFileBase;
import templates._common.ReadmeMdTemplateBase;
import templates._common.settings.EclipseCoreResourcesPrefsTemplateBase;
import templates._common.settings.EclipseJdtCorePrefsTemplateBase;
import templates._common.settings.EclipseM2eCorePrefsTemplateBase;
import templates._common.settings.EclipseWstProjectFacetCorePrefsTemplateBase;
import templates._common.settings.EclipseWstProjectFacetCoreXmlTemplateBase;
import templates._common.src_main_resource.meta_inf.EjbJarXmlTemplateBase;
import templates._common.src_main_resource.meta_inf.ManifestMfTemplateBase;
import templates._common.src_main_resource.meta_inf.PersistenceXmlTemplateBase;
import templates.model.DotProjectTemplate;
import templates.model.PomXmlTemplate;
import templates.model.src_main_java.basepack.model.entity.EntityTemplate;

/**
 * Project Generator for Model Project
 */
@SuppressWarnings("all")
public class ModelProjectGenerator extends AbstractProjectGenerator {
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
      _builder.append("-model");
      _project_1.setName(_builder.toString());
      Project _project_2 = this.getProject();
      StringConcatenation _builder_1 = new StringConcatenation();
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
      _builder_1.append(_lowerCase_1, "");
      _builder_1.append(".model");
      _project_2.setBasePackage(_builder_1.toString());
      Project _project_3 = this.getProject();
      _project_3.setProjectType(ProjectType.MODEL);
      Project _project_4 = this.getProject();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/");
      Project _project_5 = this.getProject();
      String _name_1 = null;
      if (_project_5!=null) {
        _name_1=_project_5.getName();
      }
      _builder_2.append(_name_1, "");
      _builder_2.append("/");
      _project_4.setRelativePath(_builder_2.toString());
      Project _project_6 = this.getProject();
      _project_6.setCanonicalName("Entity model project");
      Project _project_7 = this.getProject();
      _project_7.setDocumentation("This project keeps the entity model for persistence layer");
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Generating Project: ");
      Project _project_8 = this.getProject();
      String _name_2 = null;
      if (_project_8!=null) {
        _name_2=_project_8.getName();
      }
      _builder_3.append(_name_2, "");
      this.log.info(_builder_3.toString());
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
        DotGitignoreTemplateBase _dotGitignoreTemplateBase = new DotGitignoreTemplateBase(this.stubbr, _project_3);
        Project _project_4 = this.getProject();
        EclipseDotClasspathTemplateBase _eclipseDotClasspathTemplateBase = new EclipseDotClasspathTemplateBase(this.stubbr, _project_4);
        Project _project_5 = this.getProject();
        ManifestMfTemplateBase _manifestMfTemplateBase = new ManifestMfTemplateBase(this.stubbr, _project_5);
        Project _project_6 = this.getProject();
        EjbJarXmlTemplateBase _ejbJarXmlTemplateBase = new EjbJarXmlTemplateBase(this.stubbr, _project_6);
        Project _project_7 = this.getProject();
        PersistenceXmlTemplateBase _persistenceXmlTemplateBase = new PersistenceXmlTemplateBase(this.stubbr, _project_7);
        Project _project_8 = this.getProject();
        EclipseCoreResourcesPrefsTemplateBase _eclipseCoreResourcesPrefsTemplateBase = new EclipseCoreResourcesPrefsTemplateBase(this.stubbr, _project_8);
        Project _project_9 = this.getProject();
        EclipseJdtCorePrefsTemplateBase _eclipseJdtCorePrefsTemplateBase = new EclipseJdtCorePrefsTemplateBase(this.stubbr, _project_9);
        Project _project_10 = this.getProject();
        EclipseM2eCorePrefsTemplateBase _eclipseM2eCorePrefsTemplateBase = new EclipseM2eCorePrefsTemplateBase(this.stubbr, _project_10);
        Project _project_11 = this.getProject();
        EclipseWstProjectFacetCorePrefsTemplateBase _eclipseWstProjectFacetCorePrefsTemplateBase = new EclipseWstProjectFacetCorePrefsTemplateBase(this.stubbr, _project_11);
        Project _project_12 = this.getProject();
        EclipseWstProjectFacetCoreXmlTemplateBase _eclipseWstProjectFacetCoreXmlTemplateBase = new EclipseWstProjectFacetCoreXmlTemplateBase(this.stubbr, _project_12);
        Project _project_13 = this.getProject();
        PomXmlTemplate _pomXmlTemplate = new PomXmlTemplate(this.stubbr, _project_13);
        Project _project_14 = this.getProject();
        DotProjectTemplate _dotProjectTemplate = new DotProjectTemplate(this.stubbr, _project_14);
        _files.addAll(
          Collections.<AbstractTemplate>unmodifiableList(CollectionLiterals.<AbstractTemplate>newArrayList(_readmeMdTemplateBase, _intellijProjectImlFileBase, _dotGitignoreTemplateBase, _eclipseDotClasspathTemplateBase, _manifestMfTemplateBase, _ejbJarXmlTemplateBase, _persistenceXmlTemplateBase, _eclipseCoreResourcesPrefsTemplateBase, _eclipseJdtCorePrefsTemplateBase, _eclipseM2eCorePrefsTemplateBase, _eclipseWstProjectFacetCorePrefsTemplateBase, _eclipseWstProjectFacetCoreXmlTemplateBase, _pomXmlTemplate, _dotProjectTemplate)));
      }
      Stubb _stubb = null;
      if (this.stubbr!=null) {
        _stubb=this.stubbr.getStubb();
      }
      ChapterPersistence _persistence = null;
      if (_stubb!=null) {
        _persistence=_stubb.getPersistence();
      }
      EList<Entity> _entities = null;
      if (_persistence!=null) {
        _entities=_persistence.getEntities();
      }
      if (_entities!=null) {
        final Consumer<Entity> _function = (Entity entity) -> {
          Project _project_15 = this.getProject();
          List<AbstractTemplate> _files_1 = null;
          if (_project_15!=null) {
            _files_1=_project_15.getFiles();
          }
          if (_files_1!=null) {
            Project _project_16 = this.getProject();
            EntityTemplate _entityTemplate = new EntityTemplate(this.stubbr, _project_16, entity);
            _files_1.add(_entityTemplate);
          }
        };
        _entities.forEach(_function);
      }
      _xblockexpression = this.getProject();
    }
    return _xblockexpression;
  }
  
  private boolean isActive() {
    return true;
  }
}