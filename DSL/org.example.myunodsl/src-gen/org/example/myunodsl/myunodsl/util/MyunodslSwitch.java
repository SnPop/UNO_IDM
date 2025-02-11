/**
 * generated by Xtext 2.23.0
 */
package org.example.myunodsl.myunodsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.example.myunodsl.myunodsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.example.myunodsl.myunodsl.MyunodslPackage
 * @generated
 */
public class MyunodslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyunodslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyunodslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyunodslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyunodslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.UNO:
      {
        Uno uno = (Uno)theEObject;
        T result = caseUno(uno);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.CONFIGURATION:
      {
        Configuration configuration = (Configuration)theEObject;
        T result = caseConfiguration(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.MAIN:
      {
        Main main = (Main)theEObject;
        T result = caseMain(main);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.VISIBILITE:
      {
        Visibilite visibilite = (Visibilite)theEObject;
        T result = caseVisibilite(visibilite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.NOMBRE_DE_MAINS_DE_DEPART:
      {
        Nombre_de_mains_de_depart nombre_de_mains_de_depart = (Nombre_de_mains_de_depart)theEObject;
        T result = caseNombre_de_mains_de_depart(nombre_de_mains_de_depart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.NOMBRE_DE_CARTES_DE_DEPART:
      {
        Nombre_de_cartes_de_depart nombre_de_cartes_de_depart = (Nombre_de_cartes_de_depart)theEObject;
        T result = caseNombre_de_cartes_de_depart(nombre_de_cartes_de_depart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.NOMBRE_DE_TALONS_DE_DEPART:
      {
        Nombre_de_Talons_de_depart nombre_de_Talons_de_depart = (Nombre_de_Talons_de_depart)theEObject;
        T result = caseNombre_de_Talons_de_depart(nombre_de_Talons_de_depart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.ROTATION:
      {
        Rotation rotation = (Rotation)theEObject;
        T result = caseRotation(rotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.NBJOUEUR:
      {
        Nbjoueur nbjoueur = (Nbjoueur)theEObject;
        T result = caseNbjoueur(nbjoueur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.EQUIPE:
      {
        Equipe equipe = (Equipe)theEObject;
        T result = caseEquipe(equipe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.DEROULEMENT:
      {
        Deroulement deroulement = (Deroulement)theEObject;
        T result = caseDeroulement(deroulement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.PIOCHER:
      {
        Piocher piocher = (Piocher)theEObject;
        T result = casePiocher(piocher);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.NOMBRE_DE_CARTE:
      {
        Nombre_de_carte nombre_de_carte = (Nombre_de_carte)theEObject;
        T result = caseNombre_de_carte(nombre_de_carte);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.CARTES:
      {
        Cartes cartes = (Cartes)theEObject;
        T result = caseCartes(cartes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.CUMUL_CARTES:
      {
        Cumul_Cartes cumul_Cartes = (Cumul_Cartes)theEObject;
        T result = caseCumul_Cartes(cumul_Cartes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.JOUER_PLUSIEURS_CARTES:
      {
        Jouer_plusieurs_cartes jouer_plusieurs_cartes = (Jouer_plusieurs_cartes)theEObject;
        T result = caseJouer_plusieurs_cartes(jouer_plusieurs_cartes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.SUITES:
      {
        Suites suites = (Suites)theEObject;
        T result = caseSuites(suites);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.CARTES_UNO_SPECIALES:
      {
        cartes_Uno_Speciales cartes_Uno_Speciales = (cartes_Uno_Speciales)theEObject;
        T result = casecartes_Uno_Speciales(cartes_Uno_Speciales);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.COUPER_LE_JEU:
      {
        Couper_le_jeu couper_le_jeu = (Couper_le_jeu)theEObject;
        T result = caseCouper_le_jeu(couper_le_jeu);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.MEME_NOMBRE:
      {
        Meme_nombre meme_nombre = (Meme_nombre)theEObject;
        T result = caseMeme_nombre(meme_nombre);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.CHANGER_DE_MAINS:
      {
        Changer_de_mains changer_de_mains = (Changer_de_mains)theEObject;
        T result = caseChanger_de_mains(changer_de_mains);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.SEVEN_0:
      {
        Seven_0 seven_0 = (Seven_0)theEObject;
        T result = caseSeven_0(seven_0);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.PLUS4:
      {
        Plus4 plus4 = (Plus4)theEObject;
        T result = casePlus4(plus4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.PENALITE:
      {
        Penalite penalite = (Penalite)theEObject;
        T result = casePenalite(penalite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.CONTESTATIONS:
      {
        Contestations contestations = (Contestations)theEObject;
        T result = caseContestations(contestations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.FIN:
      {
        Fin fin = (Fin)theEObject;
        T result = caseFin(fin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.FIN_DE_MANCHE:
      {
        Fin_de_manche fin_de_manche = (Fin_de_manche)theEObject;
        T result = caseFin_de_manche(fin_de_manche);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.FIN_DE_PARTIE:
      {
        Fin_de_partie fin_de_partie = (Fin_de_partie)theEObject;
        T result = caseFin_de_partie(fin_de_partie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.VAINQUEUR:
      {
        Vainqueur vainqueur = (Vainqueur)theEObject;
        T result = caseVainqueur(vainqueur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.PLUS_QUATRE:
      {
        PLUS_QUATRE pluS_QUATRE = (PLUS_QUATRE)theEObject;
        T result = casePLUS_QUATRE(pluS_QUATRE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyunodslPackage.PLUS_DEUX:
      {
        PLUS_DEUX pluS_DEUX = (PLUS_DEUX)theEObject;
        T result = casePLUS_DEUX(pluS_DEUX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uno</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uno</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUno(Uno object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfiguration(Configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Main</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Main</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMain(Main object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Visibilite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Visibilite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVisibilite(Visibilite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nombre de mains de depart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nombre de mains de depart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNombre_de_mains_de_depart(Nombre_de_mains_de_depart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nombre de cartes de depart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nombre de cartes de depart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNombre_de_cartes_de_depart(Nombre_de_cartes_de_depart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nombre de Talons de depart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nombre de Talons de depart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNombre_de_Talons_de_depart(Nombre_de_Talons_de_depart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotation(Rotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nbjoueur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nbjoueur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNbjoueur(Nbjoueur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equipe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equipe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquipe(Equipe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deroulement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deroulement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeroulement(Deroulement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Piocher</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Piocher</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePiocher(Piocher object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nombre de carte</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nombre de carte</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNombre_de_carte(Nombre_de_carte object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cartes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cartes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCartes(Cartes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cumul Cartes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cumul Cartes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCumul_Cartes(Cumul_Cartes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jouer plusieurs cartes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jouer plusieurs cartes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJouer_plusieurs_cartes(Jouer_plusieurs_cartes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Suites</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Suites</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuites(Suites object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>cartes Uno Speciales</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>cartes Uno Speciales</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecartes_Uno_Speciales(cartes_Uno_Speciales object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Couper le jeu</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Couper le jeu</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCouper_le_jeu(Couper_le_jeu object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Meme nombre</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Meme nombre</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMeme_nombre(Meme_nombre object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Changer de mains</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Changer de mains</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChanger_de_mains(Changer_de_mains object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seven 0</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seven 0</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeven_0(Seven_0 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus4(Plus4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Penalite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Penalite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePenalite(Penalite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contestations</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contestations</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContestations(Contestations object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFin(Fin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fin de manche</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fin de manche</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFin_de_manche(Fin_de_manche object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fin de partie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fin de partie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFin_de_partie(Fin_de_partie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vainqueur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vainqueur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVainqueur(Vainqueur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PLUS QUATRE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PLUS QUATRE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePLUS_QUATRE(PLUS_QUATRE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PLUS DEUX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PLUS DEUX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePLUS_DEUX(PLUS_DEUX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyunodslSwitch
