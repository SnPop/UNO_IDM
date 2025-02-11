/**
 * generated by Xtext 2.23.0
 */
package org.example.myunodsl.myunodsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.example.myunodsl.myunodsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.example.myunodsl.myunodsl.MyunodslPackage
 * @generated
 */
public class MyunodslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyunodslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyunodslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MyunodslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyunodslSwitch<Adapter> modelSwitch =
    new MyunodslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseUno(Uno object)
      {
        return createUnoAdapter();
      }
      @Override
      public Adapter caseConfiguration(Configuration object)
      {
        return createConfigurationAdapter();
      }
      @Override
      public Adapter caseMain(Main object)
      {
        return createMainAdapter();
      }
      @Override
      public Adapter caseVisibilite(Visibilite object)
      {
        return createVisibiliteAdapter();
      }
      @Override
      public Adapter caseNombre_de_mains_de_depart(Nombre_de_mains_de_depart object)
      {
        return createNombre_de_mains_de_departAdapter();
      }
      @Override
      public Adapter caseNombre_de_cartes_de_depart(Nombre_de_cartes_de_depart object)
      {
        return createNombre_de_cartes_de_departAdapter();
      }
      @Override
      public Adapter caseNombre_de_Talons_de_depart(Nombre_de_Talons_de_depart object)
      {
        return createNombre_de_Talons_de_departAdapter();
      }
      @Override
      public Adapter caseRotation(Rotation object)
      {
        return createRotationAdapter();
      }
      @Override
      public Adapter caseNbjoueur(Nbjoueur object)
      {
        return createNbjoueurAdapter();
      }
      @Override
      public Adapter caseEquipe(Equipe object)
      {
        return createEquipeAdapter();
      }
      @Override
      public Adapter caseDeroulement(Deroulement object)
      {
        return createDeroulementAdapter();
      }
      @Override
      public Adapter casePiocher(Piocher object)
      {
        return createPiocherAdapter();
      }
      @Override
      public Adapter caseNombre_de_carte(Nombre_de_carte object)
      {
        return createNombre_de_carteAdapter();
      }
      @Override
      public Adapter caseCartes(Cartes object)
      {
        return createCartesAdapter();
      }
      @Override
      public Adapter caseCumul_Cartes(Cumul_Cartes object)
      {
        return createCumul_CartesAdapter();
      }
      @Override
      public Adapter caseJouer_plusieurs_cartes(Jouer_plusieurs_cartes object)
      {
        return createJouer_plusieurs_cartesAdapter();
      }
      @Override
      public Adapter caseSuites(Suites object)
      {
        return createSuitesAdapter();
      }
      @Override
      public Adapter casecartes_Uno_Speciales(cartes_Uno_Speciales object)
      {
        return createcartes_Uno_SpecialesAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseCouper_le_jeu(Couper_le_jeu object)
      {
        return createCouper_le_jeuAdapter();
      }
      @Override
      public Adapter caseMeme_nombre(Meme_nombre object)
      {
        return createMeme_nombreAdapter();
      }
      @Override
      public Adapter caseChanger_de_mains(Changer_de_mains object)
      {
        return createChanger_de_mainsAdapter();
      }
      @Override
      public Adapter caseSeven_0(Seven_0 object)
      {
        return createSeven_0Adapter();
      }
      @Override
      public Adapter casePlus4(Plus4 object)
      {
        return createPlus4Adapter();
      }
      @Override
      public Adapter casePenalite(Penalite object)
      {
        return createPenaliteAdapter();
      }
      @Override
      public Adapter caseContestations(Contestations object)
      {
        return createContestationsAdapter();
      }
      @Override
      public Adapter caseFin(Fin object)
      {
        return createFinAdapter();
      }
      @Override
      public Adapter caseFin_de_manche(Fin_de_manche object)
      {
        return createFin_de_mancheAdapter();
      }
      @Override
      public Adapter caseFin_de_partie(Fin_de_partie object)
      {
        return createFin_de_partieAdapter();
      }
      @Override
      public Adapter caseVainqueur(Vainqueur object)
      {
        return createVainqueurAdapter();
      }
      @Override
      public Adapter casePLUS_QUATRE(PLUS_QUATRE object)
      {
        return createPLUS_QUATREAdapter();
      }
      @Override
      public Adapter casePLUS_DEUX(PLUS_DEUX object)
      {
        return createPLUS_DEUXAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Uno <em>Uno</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Uno
   * @generated
   */
  public Adapter createUnoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Configuration
   * @generated
   */
  public Adapter createConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Main
   * @generated
   */
  public Adapter createMainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Visibilite <em>Visibilite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Visibilite
   * @generated
   */
  public Adapter createVisibiliteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Nombre_de_mains_de_depart <em>Nombre de mains de depart</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Nombre_de_mains_de_depart
   * @generated
   */
  public Adapter createNombre_de_mains_de_departAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Nombre_de_cartes_de_depart <em>Nombre de cartes de depart</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Nombre_de_cartes_de_depart
   * @generated
   */
  public Adapter createNombre_de_cartes_de_departAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Nombre_de_Talons_de_depart <em>Nombre de Talons de depart</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Nombre_de_Talons_de_depart
   * @generated
   */
  public Adapter createNombre_de_Talons_de_departAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Rotation <em>Rotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Rotation
   * @generated
   */
  public Adapter createRotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Nbjoueur <em>Nbjoueur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Nbjoueur
   * @generated
   */
  public Adapter createNbjoueurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Equipe <em>Equipe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Equipe
   * @generated
   */
  public Adapter createEquipeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Deroulement <em>Deroulement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Deroulement
   * @generated
   */
  public Adapter createDeroulementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Piocher <em>Piocher</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Piocher
   * @generated
   */
  public Adapter createPiocherAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Nombre_de_carte <em>Nombre de carte</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Nombre_de_carte
   * @generated
   */
  public Adapter createNombre_de_carteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Cartes <em>Cartes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Cartes
   * @generated
   */
  public Adapter createCartesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Cumul_Cartes <em>Cumul Cartes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Cumul_Cartes
   * @generated
   */
  public Adapter createCumul_CartesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Jouer_plusieurs_cartes <em>Jouer plusieurs cartes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Jouer_plusieurs_cartes
   * @generated
   */
  public Adapter createJouer_plusieurs_cartesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Suites <em>Suites</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Suites
   * @generated
   */
  public Adapter createSuitesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.cartes_Uno_Speciales <em>cartes Uno Speciales</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.cartes_Uno_Speciales
   * @generated
   */
  public Adapter createcartes_Uno_SpecialesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Couper_le_jeu <em>Couper le jeu</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Couper_le_jeu
   * @generated
   */
  public Adapter createCouper_le_jeuAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Meme_nombre <em>Meme nombre</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Meme_nombre
   * @generated
   */
  public Adapter createMeme_nombreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Changer_de_mains <em>Changer de mains</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Changer_de_mains
   * @generated
   */
  public Adapter createChanger_de_mainsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Seven_0 <em>Seven 0</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Seven_0
   * @generated
   */
  public Adapter createSeven_0Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Plus4 <em>Plus4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Plus4
   * @generated
   */
  public Adapter createPlus4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Penalite <em>Penalite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Penalite
   * @generated
   */
  public Adapter createPenaliteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Contestations <em>Contestations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Contestations
   * @generated
   */
  public Adapter createContestationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Fin <em>Fin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Fin
   * @generated
   */
  public Adapter createFinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Fin_de_manche <em>Fin de manche</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Fin_de_manche
   * @generated
   */
  public Adapter createFin_de_mancheAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Fin_de_partie <em>Fin de partie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Fin_de_partie
   * @generated
   */
  public Adapter createFin_de_partieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.Vainqueur <em>Vainqueur</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.Vainqueur
   * @generated
   */
  public Adapter createVainqueurAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.PLUS_QUATRE <em>PLUS QUATRE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.PLUS_QUATRE
   * @generated
   */
  public Adapter createPLUS_QUATREAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.myunodsl.myunodsl.PLUS_DEUX <em>PLUS DEUX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.myunodsl.myunodsl.PLUS_DEUX
   * @generated
   */
  public Adapter createPLUS_DEUXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MyunodslAdapterFactory
