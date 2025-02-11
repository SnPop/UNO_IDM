/**
 * generated by Xtext 2.23.0
 */
package org.example.myunodsl.myunodsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.myunodsl.myunodsl.MyunodslPackage;
import org.example.myunodsl.myunodsl.Nbjoueur;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nbjoueur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.myunodsl.myunodsl.impl.NbjoueurImpl#getNbj <em>Nbj</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.impl.NbjoueurImpl#getN <em>N</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NbjoueurImpl extends MinimalEObjectImpl.Container implements Nbjoueur
{
  /**
   * The default value of the '{@link #getNbj() <em>Nbj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbj()
   * @generated
   * @ordered
   */
  protected static final String NBJ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNbj() <em>Nbj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbj()
   * @generated
   * @ordered
   */
  protected String nbj = NBJ_EDEFAULT;

  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final String N_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected String n = N_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NbjoueurImpl()
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
    return MyunodslPackage.Literals.NBJOUEUR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNbj()
  {
    return nbj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNbj(String newNbj)
  {
    String oldNbj = nbj;
    nbj = newNbj;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyunodslPackage.NBJOUEUR__NBJ, oldNbj, nbj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setN(String newN)
  {
    String oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyunodslPackage.NBJOUEUR__N, oldN, n));
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
      case MyunodslPackage.NBJOUEUR__NBJ:
        return getNbj();
      case MyunodslPackage.NBJOUEUR__N:
        return getN();
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
      case MyunodslPackage.NBJOUEUR__NBJ:
        setNbj((String)newValue);
        return;
      case MyunodslPackage.NBJOUEUR__N:
        setN((String)newValue);
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
      case MyunodslPackage.NBJOUEUR__NBJ:
        setNbj(NBJ_EDEFAULT);
        return;
      case MyunodslPackage.NBJOUEUR__N:
        setN(N_EDEFAULT);
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
      case MyunodslPackage.NBJOUEUR__NBJ:
        return NBJ_EDEFAULT == null ? nbj != null : !NBJ_EDEFAULT.equals(nbj);
      case MyunodslPackage.NBJOUEUR__N:
        return N_EDEFAULT == null ? n != null : !N_EDEFAULT.equals(n);
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
    result.append(" (nbj: ");
    result.append(nbj);
    result.append(", n: ");
    result.append(n);
    result.append(')');
    return result.toString();
  }

} //NbjoueurImpl
