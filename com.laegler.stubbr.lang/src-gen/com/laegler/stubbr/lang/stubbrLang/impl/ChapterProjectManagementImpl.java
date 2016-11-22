/**
 * generated by Xtext 2.10.0
 */
package com.laegler.stubbr.lang.stubbrLang.impl;

import com.laegler.stubbr.lang.stubbrLang.ChapterProjectManagement;
import com.laegler.stubbr.lang.stubbrLang.DevProject;
import com.laegler.stubbr.lang.stubbrLang.Level1Attribute;
import com.laegler.stubbr.lang.stubbrLang.StubbrLangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chapter Project Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterProjectManagementImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterProjectManagementImpl#getScm <em>Scm</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterProjectManagementImpl#getIssueManagement <em>Issue Management</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterProjectManagementImpl#getDistroManagement <em>Distro Management</em>}</li>
 *   <li>{@link com.laegler.stubbr.lang.stubbrLang.impl.ChapterProjectManagementImpl#getCi <em>Ci</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChapterProjectManagementImpl extends ChapterImpl implements ChapterProjectManagement
{
  /**
   * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjects()
   * @generated
   * @ordered
   */
  protected EList<DevProject> projects;

  /**
   * The cached value of the '{@link #getScm() <em>Scm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScm()
   * @generated
   * @ordered
   */
  protected EList<Level1Attribute> scm;

  /**
   * The cached value of the '{@link #getIssueManagement() <em>Issue Management</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIssueManagement()
   * @generated
   * @ordered
   */
  protected EList<Level1Attribute> issueManagement;

  /**
   * The cached value of the '{@link #getDistroManagement() <em>Distro Management</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistroManagement()
   * @generated
   * @ordered
   */
  protected EList<Level1Attribute> distroManagement;

  /**
   * The cached value of the '{@link #getCi() <em>Ci</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCi()
   * @generated
   * @ordered
   */
  protected EList<Level1Attribute> ci;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChapterProjectManagementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StubbrLangPackage.eINSTANCE.getChapterProjectManagement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DevProject> getProjects()
  {
    if (projects == null)
    {
      projects = new EObjectContainmentEList<DevProject>(DevProject.class, this, StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__PROJECTS);
    }
    return projects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Level1Attribute> getScm()
  {
    if (scm == null)
    {
      scm = new EObjectContainmentEList<Level1Attribute>(Level1Attribute.class, this, StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__SCM);
    }
    return scm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Level1Attribute> getIssueManagement()
  {
    if (issueManagement == null)
    {
      issueManagement = new EObjectContainmentEList<Level1Attribute>(Level1Attribute.class, this, StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__ISSUE_MANAGEMENT);
    }
    return issueManagement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Level1Attribute> getDistroManagement()
  {
    if (distroManagement == null)
    {
      distroManagement = new EObjectContainmentEList<Level1Attribute>(Level1Attribute.class, this, StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__DISTRO_MANAGEMENT);
    }
    return distroManagement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Level1Attribute> getCi()
  {
    if (ci == null)
    {
      ci = new EObjectContainmentEList<Level1Attribute>(Level1Attribute.class, this, StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__CI);
    }
    return ci;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__PROJECTS:
        return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__SCM:
        return ((InternalEList<?>)getScm()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__ISSUE_MANAGEMENT:
        return ((InternalEList<?>)getIssueManagement()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__DISTRO_MANAGEMENT:
        return ((InternalEList<?>)getDistroManagement()).basicRemove(otherEnd, msgs);
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__CI:
        return ((InternalEList<?>)getCi()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__PROJECTS:
        return getProjects();
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__SCM:
        return getScm();
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__ISSUE_MANAGEMENT:
        return getIssueManagement();
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__DISTRO_MANAGEMENT:
        return getDistroManagement();
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__CI:
        return getCi();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__PROJECTS:
        getProjects().clear();
        getProjects().addAll((Collection<? extends DevProject>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__SCM:
        getScm().clear();
        getScm().addAll((Collection<? extends Level1Attribute>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__ISSUE_MANAGEMENT:
        getIssueManagement().clear();
        getIssueManagement().addAll((Collection<? extends Level1Attribute>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__DISTRO_MANAGEMENT:
        getDistroManagement().clear();
        getDistroManagement().addAll((Collection<? extends Level1Attribute>)newValue);
        return;
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__CI:
        getCi().clear();
        getCi().addAll((Collection<? extends Level1Attribute>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__PROJECTS:
        getProjects().clear();
        return;
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__SCM:
        getScm().clear();
        return;
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__ISSUE_MANAGEMENT:
        getIssueManagement().clear();
        return;
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__DISTRO_MANAGEMENT:
        getDistroManagement().clear();
        return;
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__CI:
        getCi().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__PROJECTS:
        return projects != null && !projects.isEmpty();
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__SCM:
        return scm != null && !scm.isEmpty();
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__ISSUE_MANAGEMENT:
        return issueManagement != null && !issueManagement.isEmpty();
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__DISTRO_MANAGEMENT:
        return distroManagement != null && !distroManagement.isEmpty();
      case StubbrLangPackage.CHAPTER_PROJECT_MANAGEMENT__CI:
        return ci != null && !ci.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ChapterProjectManagementImpl
