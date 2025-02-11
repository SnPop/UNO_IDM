/**
 * generated by Xtext 2.23.0
 */
package org.example.myunodsl.myunodsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.myunodsl.myunodsl.Configuration;
import org.example.myunodsl.myunodsl.Deroulement;
import org.example.myunodsl.myunodsl.Fin;
import org.example.myunodsl.myunodsl.MyunodslPackage;
import org.example.myunodsl.myunodsl.Uno;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.myunodsl.myunodsl.impl.UnoImpl#getUn <em>Un</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.impl.UnoImpl#getConf <em>Conf</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.impl.UnoImpl#getDeroulement <em>Deroulement</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.impl.UnoImpl#getFin <em>Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnoImpl extends MinimalEObjectImpl.Container implements Uno
{
  /**
   * The default value of the '{@link #getUn() <em>Un</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUn()
   * @generated
   * @ordered
   */
  protected static final String UN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUn() <em>Un</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUn()
   * @generated
   * @ordered
   */
  protected String un = UN_EDEFAULT;

  /**
   * The cached value of the '{@link #getConf() <em>Conf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConf()
   * @generated
   * @ordered
   */
  protected Configuration conf;

  /**
   * The cached value of the '{@link #getDeroulement() <em>Deroulement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeroulement()
   * @generated
   * @ordered
   */
  protected Deroulement deroulement;

  /**
   * The cached value of the '{@link #getFin() <em>Fin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFin()
   * @generated
   * @ordered
   */
  protected Fin fin;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnoImpl()
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
    return MyunodslPackage.Literals.UNO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUn()
  {
    return un;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUn(String newUn)
  {
    String oldUn = un;
    un = newUn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyunodslPackage.UNO__UN, oldUn, un));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Configuration getConf()
  {
    return conf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConf(Configuration newConf, NotificationChain msgs)
  {
    Configuration oldConf = conf;
    conf = newConf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyunodslPackage.UNO__CONF, oldConf, newConf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConf(Configuration newConf)
  {
    if (newConf != conf)
    {
      NotificationChain msgs = null;
      if (conf != null)
        msgs = ((InternalEObject)conf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyunodslPackage.UNO__CONF, null, msgs);
      if (newConf != null)
        msgs = ((InternalEObject)newConf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyunodslPackage.UNO__CONF, null, msgs);
      msgs = basicSetConf(newConf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyunodslPackage.UNO__CONF, newConf, newConf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Deroulement getDeroulement()
  {
    return deroulement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeroulement(Deroulement newDeroulement, NotificationChain msgs)
  {
    Deroulement oldDeroulement = deroulement;
    deroulement = newDeroulement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyunodslPackage.UNO__DEROULEMENT, oldDeroulement, newDeroulement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeroulement(Deroulement newDeroulement)
  {
    if (newDeroulement != deroulement)
    {
      NotificationChain msgs = null;
      if (deroulement != null)
        msgs = ((InternalEObject)deroulement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyunodslPackage.UNO__DEROULEMENT, null, msgs);
      if (newDeroulement != null)
        msgs = ((InternalEObject)newDeroulement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyunodslPackage.UNO__DEROULEMENT, null, msgs);
      msgs = basicSetDeroulement(newDeroulement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyunodslPackage.UNO__DEROULEMENT, newDeroulement, newDeroulement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fin getFin()
  {
    return fin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFin(Fin newFin, NotificationChain msgs)
  {
    Fin oldFin = fin;
    fin = newFin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyunodslPackage.UNO__FIN, oldFin, newFin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFin(Fin newFin)
  {
    if (newFin != fin)
    {
      NotificationChain msgs = null;
      if (fin != null)
        msgs = ((InternalEObject)fin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyunodslPackage.UNO__FIN, null, msgs);
      if (newFin != null)
        msgs = ((InternalEObject)newFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyunodslPackage.UNO__FIN, null, msgs);
      msgs = basicSetFin(newFin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyunodslPackage.UNO__FIN, newFin, newFin));
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
      case MyunodslPackage.UNO__CONF:
        return basicSetConf(null, msgs);
      case MyunodslPackage.UNO__DEROULEMENT:
        return basicSetDeroulement(null, msgs);
      case MyunodslPackage.UNO__FIN:
        return basicSetFin(null, msgs);
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
      case MyunodslPackage.UNO__UN:
        return getUn();
      case MyunodslPackage.UNO__CONF:
        return getConf();
      case MyunodslPackage.UNO__DEROULEMENT:
        return getDeroulement();
      case MyunodslPackage.UNO__FIN:
        return getFin();
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
      case MyunodslPackage.UNO__UN:
        setUn((String)newValue);
        return;
      case MyunodslPackage.UNO__CONF:
        setConf((Configuration)newValue);
        return;
      case MyunodslPackage.UNO__DEROULEMENT:
        setDeroulement((Deroulement)newValue);
        return;
      case MyunodslPackage.UNO__FIN:
        setFin((Fin)newValue);
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
      case MyunodslPackage.UNO__UN:
        setUn(UN_EDEFAULT);
        return;
      case MyunodslPackage.UNO__CONF:
        setConf((Configuration)null);
        return;
      case MyunodslPackage.UNO__DEROULEMENT:
        setDeroulement((Deroulement)null);
        return;
      case MyunodslPackage.UNO__FIN:
        setFin((Fin)null);
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
      case MyunodslPackage.UNO__UN:
        return UN_EDEFAULT == null ? un != null : !UN_EDEFAULT.equals(un);
      case MyunodslPackage.UNO__CONF:
        return conf != null;
      case MyunodslPackage.UNO__DEROULEMENT:
        return deroulement != null;
      case MyunodslPackage.UNO__FIN:
        return fin != null;
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
    result.append(" (un: ");
    result.append(un);
    result.append(')');
    return result.toString();
  }

} //UnoImpl
