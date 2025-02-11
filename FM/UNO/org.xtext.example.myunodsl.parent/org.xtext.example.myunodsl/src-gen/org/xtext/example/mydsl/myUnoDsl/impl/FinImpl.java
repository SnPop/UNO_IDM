/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.myUnoDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myUnoDsl.Fin;
import org.xtext.example.mydsl.myUnoDsl.MyUnoDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myUnoDsl.impl.FinImpl#getFdm <em>Fdm</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myUnoDsl.impl.FinImpl#getFdp <em>Fdp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinImpl extends MinimalEObjectImpl.Container implements Fin
{
  /**
   * The default value of the '{@link #getFdm() <em>Fdm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFdm()
   * @generated
   * @ordered
   */
  protected static final String FDM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFdm() <em>Fdm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFdm()
   * @generated
   * @ordered
   */
  protected String fdm = FDM_EDEFAULT;

  /**
   * The default value of the '{@link #getFdp() <em>Fdp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFdp()
   * @generated
   * @ordered
   */
  protected static final String FDP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFdp() <em>Fdp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFdp()
   * @generated
   * @ordered
   */
  protected String fdp = FDP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FinImpl()
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
    return MyUnoDslPackage.Literals.FIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFdm()
  {
    return fdm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFdm(String newFdm)
  {
    String oldFdm = fdm;
    fdm = newFdm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoDslPackage.FIN__FDM, oldFdm, fdm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFdp()
  {
    return fdp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFdp(String newFdp)
  {
    String oldFdp = fdp;
    fdp = newFdp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUnoDslPackage.FIN__FDP, oldFdp, fdp));
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
      case MyUnoDslPackage.FIN__FDM:
        return getFdm();
      case MyUnoDslPackage.FIN__FDP:
        return getFdp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyUnoDslPackage.FIN__FDM:
        setFdm((String)newValue);
        return;
      case MyUnoDslPackage.FIN__FDP:
        setFdp((String)newValue);
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
      case MyUnoDslPackage.FIN__FDM:
        setFdm(FDM_EDEFAULT);
        return;
      case MyUnoDslPackage.FIN__FDP:
        setFdp(FDP_EDEFAULT);
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
      case MyUnoDslPackage.FIN__FDM:
        return FDM_EDEFAULT == null ? fdm != null : !FDM_EDEFAULT.equals(fdm);
      case MyUnoDslPackage.FIN__FDP:
        return FDP_EDEFAULT == null ? fdp != null : !FDP_EDEFAULT.equals(fdp);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (fdm: ");
    result.append(fdm);
    result.append(", fdp: ");
    result.append(fdp);
    result.append(')');
    return result.toString();
  }

} //FinImpl
