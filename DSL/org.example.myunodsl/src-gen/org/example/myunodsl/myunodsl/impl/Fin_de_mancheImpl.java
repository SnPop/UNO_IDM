/**
 * generated by Xtext 2.23.0
 */
package org.example.myunodsl.myunodsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.myunodsl.myunodsl.Fin_de_manche;
import org.example.myunodsl.myunodsl.MyunodslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin de manche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.myunodsl.myunodsl.impl.Fin_de_mancheImpl#getFdmdu <em>Fdmdu</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.impl.Fin_de_mancheImpl#getDu <em>Du</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fin_de_mancheImpl extends MinimalEObjectImpl.Container implements Fin_de_manche
{
  /**
   * The default value of the '{@link #getFdmdu() <em>Fdmdu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFdmdu()
   * @generated
   * @ordered
   */
  protected static final String FDMDU_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFdmdu() <em>Fdmdu</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFdmdu()
   * @generated
   * @ordered
   */
  protected String fdmdu = FDMDU_EDEFAULT;

  /**
   * The default value of the '{@link #getDu() <em>Du</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDu()
   * @generated
   * @ordered
   */
  protected static final String DU_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDu() <em>Du</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDu()
   * @generated
   * @ordered
   */
  protected String du = DU_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Fin_de_mancheImpl()
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
    return MyunodslPackage.Literals.FIN_DE_MANCHE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFdmdu()
  {
    return fdmdu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFdmdu(String newFdmdu)
  {
    String oldFdmdu = fdmdu;
    fdmdu = newFdmdu;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyunodslPackage.FIN_DE_MANCHE__FDMDU, oldFdmdu, fdmdu));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDu()
  {
    return du;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDu(String newDu)
  {
    String oldDu = du;
    du = newDu;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyunodslPackage.FIN_DE_MANCHE__DU, oldDu, du));
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
      case MyunodslPackage.FIN_DE_MANCHE__FDMDU:
        return getFdmdu();
      case MyunodslPackage.FIN_DE_MANCHE__DU:
        return getDu();
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
      case MyunodslPackage.FIN_DE_MANCHE__FDMDU:
        setFdmdu((String)newValue);
        return;
      case MyunodslPackage.FIN_DE_MANCHE__DU:
        setDu((String)newValue);
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
      case MyunodslPackage.FIN_DE_MANCHE__FDMDU:
        setFdmdu(FDMDU_EDEFAULT);
        return;
      case MyunodslPackage.FIN_DE_MANCHE__DU:
        setDu(DU_EDEFAULT);
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
      case MyunodslPackage.FIN_DE_MANCHE__FDMDU:
        return FDMDU_EDEFAULT == null ? fdmdu != null : !FDMDU_EDEFAULT.equals(fdmdu);
      case MyunodslPackage.FIN_DE_MANCHE__DU:
        return DU_EDEFAULT == null ? du != null : !DU_EDEFAULT.equals(du);
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
    result.append(" (fdmdu: ");
    result.append(fdmdu);
    result.append(", du: ");
    result.append(du);
    result.append(')');
    return result.toString();
  }

} //Fin_de_mancheImpl
