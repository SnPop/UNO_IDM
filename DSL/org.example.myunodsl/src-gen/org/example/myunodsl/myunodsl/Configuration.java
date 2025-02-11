/**
 * generated by Xtext 2.23.0
 */
package org.example.myunodsl.myunodsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.myunodsl.myunodsl.Configuration#getCfg <em>Cfg</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.Configuration#getMain <em>Main</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.Configuration#getNbtd <em>Nbtd</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.Configuration#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.Configuration#getNbj <em>Nbj</em>}</li>
 *   <li>{@link org.example.myunodsl.myunodsl.Configuration#getEquipe <em>Equipe</em>}</li>
 * </ul>
 *
 * @see org.example.myunodsl.myunodsl.MyunodslPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject
{
  /**
   * Returns the value of the '<em><b>Cfg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cfg</em>' attribute.
   * @see #setCfg(String)
   * @see org.example.myunodsl.myunodsl.MyunodslPackage#getConfiguration_Cfg()
   * @model
   * @generated
   */
  String getCfg();

  /**
   * Sets the value of the '{@link org.example.myunodsl.myunodsl.Configuration#getCfg <em>Cfg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cfg</em>' attribute.
   * @see #getCfg()
   * @generated
   */
  void setCfg(String value);

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(Main)
   * @see org.example.myunodsl.myunodsl.MyunodslPackage#getConfiguration_Main()
   * @model containment="true"
   * @generated
   */
  Main getMain();

  /**
   * Sets the value of the '{@link org.example.myunodsl.myunodsl.Configuration#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(Main value);

  /**
   * Returns the value of the '<em><b>Nbtd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nbtd</em>' containment reference.
   * @see #setNbtd(Nombre_de_Talons_de_depart)
   * @see org.example.myunodsl.myunodsl.MyunodslPackage#getConfiguration_Nbtd()
   * @model containment="true"
   * @generated
   */
  Nombre_de_Talons_de_depart getNbtd();

  /**
   * Sets the value of the '{@link org.example.myunodsl.myunodsl.Configuration#getNbtd <em>Nbtd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nbtd</em>' containment reference.
   * @see #getNbtd()
   * @generated
   */
  void setNbtd(Nombre_de_Talons_de_depart value);

  /**
   * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotation</em>' containment reference.
   * @see #setRotation(Rotation)
   * @see org.example.myunodsl.myunodsl.MyunodslPackage#getConfiguration_Rotation()
   * @model containment="true"
   * @generated
   */
  Rotation getRotation();

  /**
   * Sets the value of the '{@link org.example.myunodsl.myunodsl.Configuration#getRotation <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotation</em>' containment reference.
   * @see #getRotation()
   * @generated
   */
  void setRotation(Rotation value);

  /**
   * Returns the value of the '<em><b>Nbj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nbj</em>' containment reference.
   * @see #setNbj(Nbjoueur)
   * @see org.example.myunodsl.myunodsl.MyunodslPackage#getConfiguration_Nbj()
   * @model containment="true"
   * @generated
   */
  Nbjoueur getNbj();

  /**
   * Sets the value of the '{@link org.example.myunodsl.myunodsl.Configuration#getNbj <em>Nbj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nbj</em>' containment reference.
   * @see #getNbj()
   * @generated
   */
  void setNbj(Nbjoueur value);

  /**
   * Returns the value of the '<em><b>Equipe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equipe</em>' containment reference.
   * @see #setEquipe(Equipe)
   * @see org.example.myunodsl.myunodsl.MyunodslPackage#getConfiguration_Equipe()
   * @model containment="true"
   * @generated
   */
  Equipe getEquipe();

  /**
   * Sets the value of the '{@link org.example.myunodsl.myunodsl.Configuration#getEquipe <em>Equipe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equipe</em>' containment reference.
   * @see #getEquipe()
   * @generated
   */
  void setEquipe(Equipe value);

} // Configuration
