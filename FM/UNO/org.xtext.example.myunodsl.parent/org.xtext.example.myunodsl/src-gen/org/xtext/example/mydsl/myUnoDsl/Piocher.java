/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.myUnoDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piocher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myUnoDsl.Piocher#getNbr <em>Nbr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myUnoDsl.Piocher#getOptp <em>Optp</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myUnoDsl.MyUnoDslPackage#getPiocher()
 * @model
 * @generated
 */
public interface Piocher extends EObject
{
  /**
   * Returns the value of the '<em><b>Nbr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nbr</em>' attribute.
   * @see #setNbr(String)
   * @see org.xtext.example.mydsl.myUnoDsl.MyUnoDslPackage#getPiocher_Nbr()
   * @model
   * @generated
   */
  String getNbr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myUnoDsl.Piocher#getNbr <em>Nbr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nbr</em>' attribute.
   * @see #getNbr()
   * @generated
   */
  void setNbr(String value);

  /**
   * Returns the value of the '<em><b>Optp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optp</em>' attribute.
   * @see #setOptp(String)
   * @see org.xtext.example.mydsl.myUnoDsl.MyUnoDslPackage#getPiocher_Optp()
   * @model
   * @generated
   */
  String getOptp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myUnoDsl.Piocher#getOptp <em>Optp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optp</em>' attribute.
   * @see #getOptp()
   * @generated
   */
  void setOptp(String value);

} // Piocher
