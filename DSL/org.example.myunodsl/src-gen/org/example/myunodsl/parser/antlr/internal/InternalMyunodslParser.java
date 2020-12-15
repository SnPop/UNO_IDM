package org.example.myunodsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.myunodsl.services.MyunodslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyunodslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Uno'", "'{'", "'}'", "'Configuration'", "'['", "']'", "'Main'", "'<'", "'Visibilite'", "':'", "'Visible'", "'Cach\\u00E9e'", "'>'", "'Nombre de mains de depart'", "'1 main'", "'Plusieurs mains'", "'Nombre de cartes de depart'", "'7'", "'4'", "'7-15'", "'cartes'", "'Nombre de talons'", "'1 talon'", "'3 talons'", "'Rotation'", "'Sens des aiguilles d une montre'", "'Sens contraire des aiguilles d une montre'", "'Sens de distribution'", "'Nombre de joueur'", "'3-10'", "'2'", "'Jeu'", "'Solo'", "'Equipes'", "'Deroulement'", "'Piocher'", "'seulement si on ne peut pas jouer'", "'Nombre de carte'", "'1 carte'", "'jusqu\\u00E0 3'", "'cumul'", "'effet'", "'Jouer plusieurs cartes'", "'couleur'", "'nombre'", "'Suite'", "'suite royale'", "'cartes Uno speciales'", "'Plus'", "'couper le jeu'", "'meme nombre'", "'meme carte'", "'Changer de mains'", "'Seven_0'", "'Sept'", "'Zero'", "'seulement si rien d autre'", "'Interdit de finir avec un'", "'Penalites'", "'commentaire intempestif'", "'Tribunal Populaire si litige'", "'Limite de temps'", "'Contestations'", "'se tromper'", "'Fin'", "'Fin de manche'", "'Dire Uno'", "'Fin de partie Vainceur'", "'nombre de manches gagn\\u00E9es'", "'moins de points'", "'dernier : battle royale'", "'plus de points'", "'Plus 4'", "'+4'", "'Plus 2'", "'+2'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyunodslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyunodslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyunodslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyunodsl.g"; }



     	private MyunodslGrammarAccess grammarAccess;

        public InternalMyunodslParser(TokenStream input, MyunodslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyunodslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyunodsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyunodsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyunodsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyunodsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_uno_0_0= ruleUno ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_uno_0_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:77:2: ( ( (lv_uno_0_0= ruleUno ) ) )
            // InternalMyunodsl.g:78:2: ( (lv_uno_0_0= ruleUno ) )
            {
            // InternalMyunodsl.g:78:2: ( (lv_uno_0_0= ruleUno ) )
            // InternalMyunodsl.g:79:3: (lv_uno_0_0= ruleUno )
            {
            // InternalMyunodsl.g:79:3: (lv_uno_0_0= ruleUno )
            // InternalMyunodsl.g:80:4: lv_uno_0_0= ruleUno
            {

            				newCompositeNode(grammarAccess.getModelAccess().getUnoUnoParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_uno_0_0=ruleUno();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"uno",
            					lv_uno_0_0,
            					"org.example.myunodsl.Myunodsl.Uno");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUno"
    // InternalMyunodsl.g:100:1: entryRuleUno returns [EObject current=null] : iv_ruleUno= ruleUno EOF ;
    public final EObject entryRuleUno() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUno = null;


        try {
            // InternalMyunodsl.g:100:44: (iv_ruleUno= ruleUno EOF )
            // InternalMyunodsl.g:101:2: iv_ruleUno= ruleUno EOF
            {
             newCompositeNode(grammarAccess.getUnoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUno=ruleUno();

            state._fsp--;

             current =iv_ruleUno; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUno"


    // $ANTLR start "ruleUno"
    // InternalMyunodsl.g:107:1: ruleUno returns [EObject current=null] : ( ( (lv_un_0_0= 'Uno' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' ) ;
    public final EObject ruleUno() throws RecognitionException {
        EObject current = null;

        Token lv_un_0_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_conf_3_0 = null;

        EObject lv_deroulement_4_0 = null;

        EObject lv_fin_5_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:113:2: ( ( ( (lv_un_0_0= 'Uno' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' ) )
            // InternalMyunodsl.g:114:2: ( ( (lv_un_0_0= 'Uno' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' )
            {
            // InternalMyunodsl.g:114:2: ( ( (lv_un_0_0= 'Uno' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' )
            // InternalMyunodsl.g:115:3: ( (lv_un_0_0= 'Uno' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}'
            {
            // InternalMyunodsl.g:115:3: ( (lv_un_0_0= 'Uno' ) )
            // InternalMyunodsl.g:116:4: (lv_un_0_0= 'Uno' )
            {
            // InternalMyunodsl.g:116:4: (lv_un_0_0= 'Uno' )
            // InternalMyunodsl.g:117:5: lv_un_0_0= 'Uno'
            {
            lv_un_0_0=(Token)match(input,11,FOLLOW_3); 

            					newLeafNode(lv_un_0_0, grammarAccess.getUnoAccess().getUnUnoKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnoRule());
            					}
            					setWithLastConsumed(current, "un", lv_un_0_0, "Uno");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUnoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:133:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?) ) )
            // InternalMyunodsl.g:134:4: ( ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyunodsl.g:134:4: ( ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?) )
            // InternalMyunodsl.g:135:5: ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getUnoAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:138:5: ( ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?)
            // InternalMyunodsl.g:139:6: ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+ {...}?
            {
            // InternalMyunodsl.g:139:6: ( ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 2) ) {
                    alt1=3;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyunodsl.g:140:4: ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:140:4: ({...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) ) )
            	    // InternalMyunodsl.g:141:5: {...}? => ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUno", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:141:100: ( ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) ) )
            	    // InternalMyunodsl.g:142:6: ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:145:9: ({...}? => ( (lv_conf_3_0= ruleConfiguration ) ) )
            	    // InternalMyunodsl.g:145:10: {...}? => ( (lv_conf_3_0= ruleConfiguration ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUno", "true");
            	    }
            	    // InternalMyunodsl.g:145:19: ( (lv_conf_3_0= ruleConfiguration ) )
            	    // InternalMyunodsl.g:145:20: (lv_conf_3_0= ruleConfiguration )
            	    {
            	    // InternalMyunodsl.g:145:20: (lv_conf_3_0= ruleConfiguration )
            	    // InternalMyunodsl.g:146:10: lv_conf_3_0= ruleConfiguration
            	    {

            	    										newCompositeNode(grammarAccess.getUnoAccess().getConfConfigurationParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_conf_3_0=ruleConfiguration();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getUnoRule());
            	    										}
            	    										set(
            	    											current,
            	    											"conf",
            	    											lv_conf_3_0,
            	    											"org.example.myunodsl.Myunodsl.Configuration");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:168:4: ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:168:4: ({...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) ) )
            	    // InternalMyunodsl.g:169:5: {...}? => ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUno", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:169:100: ( ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) ) )
            	    // InternalMyunodsl.g:170:6: ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:173:9: ({...}? => ( (lv_deroulement_4_0= ruleDeroulement ) ) )
            	    // InternalMyunodsl.g:173:10: {...}? => ( (lv_deroulement_4_0= ruleDeroulement ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUno", "true");
            	    }
            	    // InternalMyunodsl.g:173:19: ( (lv_deroulement_4_0= ruleDeroulement ) )
            	    // InternalMyunodsl.g:173:20: (lv_deroulement_4_0= ruleDeroulement )
            	    {
            	    // InternalMyunodsl.g:173:20: (lv_deroulement_4_0= ruleDeroulement )
            	    // InternalMyunodsl.g:174:10: lv_deroulement_4_0= ruleDeroulement
            	    {

            	    										newCompositeNode(grammarAccess.getUnoAccess().getDeroulementDeroulementParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_deroulement_4_0=ruleDeroulement();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getUnoRule());
            	    										}
            	    										set(
            	    											current,
            	    											"deroulement",
            	    											lv_deroulement_4_0,
            	    											"org.example.myunodsl.Myunodsl.Deroulement");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyunodsl.g:196:4: ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:196:4: ({...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) ) )
            	    // InternalMyunodsl.g:197:5: {...}? => ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUno", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyunodsl.g:197:100: ( ({...}? => ( (lv_fin_5_0= ruleFin ) ) ) )
            	    // InternalMyunodsl.g:198:6: ({...}? => ( (lv_fin_5_0= ruleFin ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getUnoAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyunodsl.g:201:9: ({...}? => ( (lv_fin_5_0= ruleFin ) ) )
            	    // InternalMyunodsl.g:201:10: {...}? => ( (lv_fin_5_0= ruleFin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUno", "true");
            	    }
            	    // InternalMyunodsl.g:201:19: ( (lv_fin_5_0= ruleFin ) )
            	    // InternalMyunodsl.g:201:20: (lv_fin_5_0= ruleFin )
            	    {
            	    // InternalMyunodsl.g:201:20: (lv_fin_5_0= ruleFin )
            	    // InternalMyunodsl.g:202:10: lv_fin_5_0= ruleFin
            	    {

            	    										newCompositeNode(grammarAccess.getUnoAccess().getFinFinParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_fin_5_0=ruleFin();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getUnoRule());
            	    										}
            	    										set(
            	    											current,
            	    											"fin",
            	    											lv_fin_5_0,
            	    											"org.example.myunodsl.Myunodsl.Fin");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUnoAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleUno", "getUnorderedGroupHelper().canLeave(grammarAccess.getUnoAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getUnoAccess().getUnorderedGroup_2());
            				

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUnoAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUno"


    // $ANTLR start "entryRuleConfiguration"
    // InternalMyunodsl.g:240:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalMyunodsl.g:240:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalMyunodsl.g:241:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalMyunodsl.g:247:1: ruleConfiguration returns [EObject current=null] : ( ( (lv_cfg_0_0= 'Configuration' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token lv_cfg_0_0=null;
        Token otherlv_1=null;
        Token otherlv_8=null;
        EObject lv_main_3_0 = null;

        EObject lv_nbtd_4_0 = null;

        EObject lv_rotation_5_0 = null;

        EObject lv_nbj_6_0 = null;

        EObject lv_equipe_7_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:253:2: ( ( ( (lv_cfg_0_0= 'Configuration' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']' ) )
            // InternalMyunodsl.g:254:2: ( ( (lv_cfg_0_0= 'Configuration' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']' )
            {
            // InternalMyunodsl.g:254:2: ( ( (lv_cfg_0_0= 'Configuration' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']' )
            // InternalMyunodsl.g:255:3: ( (lv_cfg_0_0= 'Configuration' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?) ) ) otherlv_8= ']'
            {
            // InternalMyunodsl.g:255:3: ( (lv_cfg_0_0= 'Configuration' ) )
            // InternalMyunodsl.g:256:4: (lv_cfg_0_0= 'Configuration' )
            {
            // InternalMyunodsl.g:256:4: (lv_cfg_0_0= 'Configuration' )
            // InternalMyunodsl.g:257:5: lv_cfg_0_0= 'Configuration'
            {
            lv_cfg_0_0=(Token)match(input,14,FOLLOW_6); 

            					newLeafNode(lv_cfg_0_0, grammarAccess.getConfigurationAccess().getCfgConfigurationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(current, "cfg", lv_cfg_0_0, "Configuration");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigurationAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyunodsl.g:273:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?) ) )
            // InternalMyunodsl.g:274:4: ( ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyunodsl.g:274:4: ( ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?) )
            // InternalMyunodsl.g:275:5: ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConfigurationAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:278:5: ( ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?)
            // InternalMyunodsl.g:279:6: ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+ {...}?
            {
            // InternalMyunodsl.g:279:6: ( ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=6;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 3) ) {
                    alt2=4;
                }
                else if ( LA2_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 4) ) {
                    alt2=5;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyunodsl.g:280:4: ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:280:4: ({...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) ) )
            	    // InternalMyunodsl.g:281:5: {...}? => ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:281:110: ( ({...}? => ( (lv_main_3_0= ruleMain ) ) ) )
            	    // InternalMyunodsl.g:282:6: ({...}? => ( (lv_main_3_0= ruleMain ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:285:9: ({...}? => ( (lv_main_3_0= ruleMain ) ) )
            	    // InternalMyunodsl.g:285:10: {...}? => ( (lv_main_3_0= ruleMain ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
            	    }
            	    // InternalMyunodsl.g:285:19: ( (lv_main_3_0= ruleMain ) )
            	    // InternalMyunodsl.g:285:20: (lv_main_3_0= ruleMain )
            	    {
            	    // InternalMyunodsl.g:285:20: (lv_main_3_0= ruleMain )
            	    // InternalMyunodsl.g:286:10: lv_main_3_0= ruleMain
            	    {

            	    										newCompositeNode(grammarAccess.getConfigurationAccess().getMainMainParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_main_3_0=ruleMain();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"main",
            	    											lv_main_3_0,
            	    											"org.example.myunodsl.Myunodsl.Main");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:308:4: ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:308:4: ({...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) ) )
            	    // InternalMyunodsl.g:309:5: {...}? => ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:309:110: ( ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) ) )
            	    // InternalMyunodsl.g:310:6: ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:313:9: ({...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) ) )
            	    // InternalMyunodsl.g:313:10: {...}? => ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
            	    }
            	    // InternalMyunodsl.g:313:19: ( (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart ) )
            	    // InternalMyunodsl.g:313:20: (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart )
            	    {
            	    // InternalMyunodsl.g:313:20: (lv_nbtd_4_0= ruleNombre_de_Talons_de_depart )
            	    // InternalMyunodsl.g:314:10: lv_nbtd_4_0= ruleNombre_de_Talons_de_depart
            	    {

            	    										newCompositeNode(grammarAccess.getConfigurationAccess().getNbtdNombre_de_Talons_de_departParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_nbtd_4_0=ruleNombre_de_Talons_de_depart();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nbtd",
            	    											lv_nbtd_4_0,
            	    											"org.example.myunodsl.Myunodsl.Nombre_de_Talons_de_depart");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyunodsl.g:336:4: ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:336:4: ({...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) ) )
            	    // InternalMyunodsl.g:337:5: {...}? => ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyunodsl.g:337:110: ( ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) ) )
            	    // InternalMyunodsl.g:338:6: ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyunodsl.g:341:9: ({...}? => ( (lv_rotation_5_0= ruleRotation ) ) )
            	    // InternalMyunodsl.g:341:10: {...}? => ( (lv_rotation_5_0= ruleRotation ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
            	    }
            	    // InternalMyunodsl.g:341:19: ( (lv_rotation_5_0= ruleRotation ) )
            	    // InternalMyunodsl.g:341:20: (lv_rotation_5_0= ruleRotation )
            	    {
            	    // InternalMyunodsl.g:341:20: (lv_rotation_5_0= ruleRotation )
            	    // InternalMyunodsl.g:342:10: lv_rotation_5_0= ruleRotation
            	    {

            	    										newCompositeNode(grammarAccess.getConfigurationAccess().getRotationRotationParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_rotation_5_0=ruleRotation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"rotation",
            	    											lv_rotation_5_0,
            	    											"org.example.myunodsl.Myunodsl.Rotation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyunodsl.g:364:4: ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:364:4: ({...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) ) )
            	    // InternalMyunodsl.g:365:5: {...}? => ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyunodsl.g:365:110: ( ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) ) )
            	    // InternalMyunodsl.g:366:6: ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyunodsl.g:369:9: ({...}? => ( (lv_nbj_6_0= ruleNbjoueur ) ) )
            	    // InternalMyunodsl.g:369:10: {...}? => ( (lv_nbj_6_0= ruleNbjoueur ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
            	    }
            	    // InternalMyunodsl.g:369:19: ( (lv_nbj_6_0= ruleNbjoueur ) )
            	    // InternalMyunodsl.g:369:20: (lv_nbj_6_0= ruleNbjoueur )
            	    {
            	    // InternalMyunodsl.g:369:20: (lv_nbj_6_0= ruleNbjoueur )
            	    // InternalMyunodsl.g:370:10: lv_nbj_6_0= ruleNbjoueur
            	    {

            	    										newCompositeNode(grammarAccess.getConfigurationAccess().getNbjNbjoueurParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_nbj_6_0=ruleNbjoueur();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nbj",
            	    											lv_nbj_6_0,
            	    											"org.example.myunodsl.Myunodsl.Nbjoueur");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyunodsl.g:392:4: ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:392:4: ({...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) ) )
            	    // InternalMyunodsl.g:393:5: {...}? => ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyunodsl.g:393:110: ( ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) ) )
            	    // InternalMyunodsl.g:394:6: ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConfigurationAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyunodsl.g:397:9: ({...}? => ( (lv_equipe_7_0= ruleEquipe ) ) )
            	    // InternalMyunodsl.g:397:10: {...}? => ( (lv_equipe_7_0= ruleEquipe ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConfiguration", "true");
            	    }
            	    // InternalMyunodsl.g:397:19: ( (lv_equipe_7_0= ruleEquipe ) )
            	    // InternalMyunodsl.g:397:20: (lv_equipe_7_0= ruleEquipe )
            	    {
            	    // InternalMyunodsl.g:397:20: (lv_equipe_7_0= ruleEquipe )
            	    // InternalMyunodsl.g:398:10: lv_equipe_7_0= ruleEquipe
            	    {

            	    										newCompositeNode(grammarAccess.getConfigurationAccess().getEquipeEquipeParserRuleCall_2_4_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_equipe_7_0=ruleEquipe();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"equipe",
            	    											lv_equipe_7_0,
            	    											"org.example.myunodsl.Myunodsl.Equipe");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConfigurationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getConfigurationAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleConfiguration", "getUnorderedGroupHelper().canLeave(grammarAccess.getConfigurationAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getConfigurationAccess().getUnorderedGroup_2());
            				

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getConfigurationAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleMain"
    // InternalMyunodsl.g:436:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalMyunodsl.g:436:45: (iv_ruleMain= ruleMain EOF )
            // InternalMyunodsl.g:437:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMyunodsl.g:443:1: ruleMain returns [EObject current=null] : ( ( (lv_main_0_0= 'Main' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token lv_main_0_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_visibilite_3_0 = null;

        EObject lv_nbm_4_0 = null;

        EObject lv_nbc_5_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:449:2: ( ( ( (lv_main_0_0= 'Main' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' ) )
            // InternalMyunodsl.g:450:2: ( ( (lv_main_0_0= 'Main' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' )
            {
            // InternalMyunodsl.g:450:2: ( ( (lv_main_0_0= 'Main' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}' )
            // InternalMyunodsl.g:451:3: ( (lv_main_0_0= 'Main' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?) ) ) otherlv_6= '}'
            {
            // InternalMyunodsl.g:451:3: ( (lv_main_0_0= 'Main' ) )
            // InternalMyunodsl.g:452:4: (lv_main_0_0= 'Main' )
            {
            // InternalMyunodsl.g:452:4: (lv_main_0_0= 'Main' )
            // InternalMyunodsl.g:453:5: lv_main_0_0= 'Main'
            {
            lv_main_0_0=(Token)match(input,17,FOLLOW_3); 

            					newLeafNode(lv_main_0_0, grammarAccess.getMainAccess().getMainMainKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainRule());
            					}
            					setWithLastConsumed(current, "main", lv_main_0_0, "Main");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:469:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?) ) )
            // InternalMyunodsl.g:470:4: ( ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyunodsl.g:470:4: ( ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?) )
            // InternalMyunodsl.g:471:5: ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMainAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:474:5: ( ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?)
            // InternalMyunodsl.g:475:6: ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+ {...}?
            {
            // InternalMyunodsl.g:475:6: ( ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 1) ) ) {
                    int LA3_2 = input.LA(2);

                    if ( LA3_2 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 2) ) {
                        alt3=3;
                    }
                    else if ( LA3_2 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 0) ) {
                        alt3=1;
                    }
                    else if ( LA3_2 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 1) ) {
                        alt3=2;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyunodsl.g:476:4: ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:476:4: ({...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) ) )
            	    // InternalMyunodsl.g:477:5: {...}? => ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:477:101: ( ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) ) )
            	    // InternalMyunodsl.g:478:6: ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:481:9: ({...}? => ( (lv_visibilite_3_0= ruleVisibilite ) ) )
            	    // InternalMyunodsl.g:481:10: {...}? => ( (lv_visibilite_3_0= ruleVisibilite ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "true");
            	    }
            	    // InternalMyunodsl.g:481:19: ( (lv_visibilite_3_0= ruleVisibilite ) )
            	    // InternalMyunodsl.g:481:20: (lv_visibilite_3_0= ruleVisibilite )
            	    {
            	    // InternalMyunodsl.g:481:20: (lv_visibilite_3_0= ruleVisibilite )
            	    // InternalMyunodsl.g:482:10: lv_visibilite_3_0= ruleVisibilite
            	    {

            	    										newCompositeNode(grammarAccess.getMainAccess().getVisibiliteVisibiliteParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_10);
            	    lv_visibilite_3_0=ruleVisibilite();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMainRule());
            	    										}
            	    										set(
            	    											current,
            	    											"visibilite",
            	    											lv_visibilite_3_0,
            	    											"org.example.myunodsl.Myunodsl.Visibilite");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:504:4: ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:504:4: ({...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) ) )
            	    // InternalMyunodsl.g:505:5: {...}? => ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:505:101: ( ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) ) )
            	    // InternalMyunodsl.g:506:6: ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:509:9: ({...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) ) )
            	    // InternalMyunodsl.g:509:10: {...}? => ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "true");
            	    }
            	    // InternalMyunodsl.g:509:19: ( (lv_nbm_4_0= ruleNombre_de_mains_de_depart ) )
            	    // InternalMyunodsl.g:509:20: (lv_nbm_4_0= ruleNombre_de_mains_de_depart )
            	    {
            	    // InternalMyunodsl.g:509:20: (lv_nbm_4_0= ruleNombre_de_mains_de_depart )
            	    // InternalMyunodsl.g:510:10: lv_nbm_4_0= ruleNombre_de_mains_de_depart
            	    {

            	    										newCompositeNode(grammarAccess.getMainAccess().getNbmNombre_de_mains_de_departParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_10);
            	    lv_nbm_4_0=ruleNombre_de_mains_de_depart();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMainRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nbm",
            	    											lv_nbm_4_0,
            	    											"org.example.myunodsl.Myunodsl.Nombre_de_mains_de_depart");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyunodsl.g:532:4: ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:532:4: ({...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) ) )
            	    // InternalMyunodsl.g:533:5: {...}? => ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canSelect(grammarAccess.getMainAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyunodsl.g:533:101: ( ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) ) )
            	    // InternalMyunodsl.g:534:6: ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMainAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyunodsl.g:537:9: ({...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) ) )
            	    // InternalMyunodsl.g:537:10: {...}? => ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMain", "true");
            	    }
            	    // InternalMyunodsl.g:537:19: ( (lv_nbc_5_0= ruleNombre_de_cartes_de_depart ) )
            	    // InternalMyunodsl.g:537:20: (lv_nbc_5_0= ruleNombre_de_cartes_de_depart )
            	    {
            	    // InternalMyunodsl.g:537:20: (lv_nbc_5_0= ruleNombre_de_cartes_de_depart )
            	    // InternalMyunodsl.g:538:10: lv_nbc_5_0= ruleNombre_de_cartes_de_depart
            	    {

            	    										newCompositeNode(grammarAccess.getMainAccess().getNbcNombre_de_cartes_de_departParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_10);
            	    lv_nbc_5_0=ruleNombre_de_cartes_de_depart();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMainRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nbc",
            	    											lv_nbc_5_0,
            	    											"org.example.myunodsl.Myunodsl.Nombre_de_cartes_de_depart");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMainAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMainAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleMain", "getUnorderedGroupHelper().canLeave(grammarAccess.getMainAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMainAccess().getUnorderedGroup_2());
            				

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMainAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleVisibilite"
    // InternalMyunodsl.g:576:1: entryRuleVisibilite returns [EObject current=null] : iv_ruleVisibilite= ruleVisibilite EOF ;
    public final EObject entryRuleVisibilite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilite = null;


        try {
            // InternalMyunodsl.g:576:51: (iv_ruleVisibilite= ruleVisibilite EOF )
            // InternalMyunodsl.g:577:2: iv_ruleVisibilite= ruleVisibilite EOF
            {
             newCompositeNode(grammarAccess.getVisibiliteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisibilite=ruleVisibilite();

            state._fsp--;

             current =iv_ruleVisibilite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibilite"


    // $ANTLR start "ruleVisibilite"
    // InternalMyunodsl.g:583:1: ruleVisibilite returns [EObject current=null] : (otherlv_0= '<' otherlv_1= 'Visibilite' otherlv_2= ':' ( ( (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' ) ) ) otherlv_4= '>' ) ;
    public final EObject ruleVisibilite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_vis_3_1=null;
        Token lv_vis_3_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:589:2: ( (otherlv_0= '<' otherlv_1= 'Visibilite' otherlv_2= ':' ( ( (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' ) ) ) otherlv_4= '>' ) )
            // InternalMyunodsl.g:590:2: (otherlv_0= '<' otherlv_1= 'Visibilite' otherlv_2= ':' ( ( (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' ) ) ) otherlv_4= '>' )
            {
            // InternalMyunodsl.g:590:2: (otherlv_0= '<' otherlv_1= 'Visibilite' otherlv_2= ':' ( ( (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' ) ) ) otherlv_4= '>' )
            // InternalMyunodsl.g:591:3: otherlv_0= '<' otherlv_1= 'Visibilite' otherlv_2= ':' ( ( (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' ) ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVisibiliteAccess().getLessThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVisibiliteAccess().getVisibiliteKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVisibiliteAccess().getColonKeyword_2());
            		
            // InternalMyunodsl.g:603:3: ( ( (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' ) ) )
            // InternalMyunodsl.g:604:4: ( (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' ) )
            {
            // InternalMyunodsl.g:604:4: ( (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' ) )
            // InternalMyunodsl.g:605:5: (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' )
            {
            // InternalMyunodsl.g:605:5: (lv_vis_3_1= 'Visible' | lv_vis_3_2= 'Cach\\u00E9e' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyunodsl.g:606:6: lv_vis_3_1= 'Visible'
                    {
                    lv_vis_3_1=(Token)match(input,21,FOLLOW_14); 

                    						newLeafNode(lv_vis_3_1, grammarAccess.getVisibiliteAccess().getVisVisibleKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisibiliteRule());
                    						}
                    						setWithLastConsumed(current, "vis", lv_vis_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:617:6: lv_vis_3_2= 'Cach\\u00E9e'
                    {
                    lv_vis_3_2=(Token)match(input,22,FOLLOW_14); 

                    						newLeafNode(lv_vis_3_2, grammarAccess.getVisibiliteAccess().getVisCachEKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVisibiliteRule());
                    						}
                    						setWithLastConsumed(current, "vis", lv_vis_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVisibiliteAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilite"


    // $ANTLR start "entryRuleNombre_de_mains_de_depart"
    // InternalMyunodsl.g:638:1: entryRuleNombre_de_mains_de_depart returns [EObject current=null] : iv_ruleNombre_de_mains_de_depart= ruleNombre_de_mains_de_depart EOF ;
    public final EObject entryRuleNombre_de_mains_de_depart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNombre_de_mains_de_depart = null;


        try {
            // InternalMyunodsl.g:638:66: (iv_ruleNombre_de_mains_de_depart= ruleNombre_de_mains_de_depart EOF )
            // InternalMyunodsl.g:639:2: iv_ruleNombre_de_mains_de_depart= ruleNombre_de_mains_de_depart EOF
            {
             newCompositeNode(grammarAccess.getNombre_de_mains_de_departRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNombre_de_mains_de_depart=ruleNombre_de_mains_de_depart();

            state._fsp--;

             current =iv_ruleNombre_de_mains_de_depart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNombre_de_mains_de_depart"


    // $ANTLR start "ruleNombre_de_mains_de_depart"
    // InternalMyunodsl.g:645:1: ruleNombre_de_mains_de_depart returns [EObject current=null] : (otherlv_0= '<' ( (lv_nbm_1_0= 'Nombre de mains de depart' ) ) otherlv_2= ':' ( ( (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' ) ) ) otherlv_4= '>' ) ;
    public final EObject ruleNombre_de_mains_de_depart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nbm_1_0=null;
        Token otherlv_2=null;
        Token lv_main_3_1=null;
        Token lv_main_3_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:651:2: ( (otherlv_0= '<' ( (lv_nbm_1_0= 'Nombre de mains de depart' ) ) otherlv_2= ':' ( ( (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' ) ) ) otherlv_4= '>' ) )
            // InternalMyunodsl.g:652:2: (otherlv_0= '<' ( (lv_nbm_1_0= 'Nombre de mains de depart' ) ) otherlv_2= ':' ( ( (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' ) ) ) otherlv_4= '>' )
            {
            // InternalMyunodsl.g:652:2: (otherlv_0= '<' ( (lv_nbm_1_0= 'Nombre de mains de depart' ) ) otherlv_2= ':' ( ( (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' ) ) ) otherlv_4= '>' )
            // InternalMyunodsl.g:653:3: otherlv_0= '<' ( (lv_nbm_1_0= 'Nombre de mains de depart' ) ) otherlv_2= ':' ( ( (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' ) ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getNombre_de_mains_de_departAccess().getLessThanSignKeyword_0());
            		
            // InternalMyunodsl.g:657:3: ( (lv_nbm_1_0= 'Nombre de mains de depart' ) )
            // InternalMyunodsl.g:658:4: (lv_nbm_1_0= 'Nombre de mains de depart' )
            {
            // InternalMyunodsl.g:658:4: (lv_nbm_1_0= 'Nombre de mains de depart' )
            // InternalMyunodsl.g:659:5: lv_nbm_1_0= 'Nombre de mains de depart'
            {
            lv_nbm_1_0=(Token)match(input,24,FOLLOW_12); 

            					newLeafNode(lv_nbm_1_0, grammarAccess.getNombre_de_mains_de_departAccess().getNbmNombreDeMainsDeDepartKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNombre_de_mains_de_departRule());
            					}
            					setWithLastConsumed(current, "nbm", lv_nbm_1_0, "Nombre de mains de depart");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getNombre_de_mains_de_departAccess().getColonKeyword_2());
            		
            // InternalMyunodsl.g:675:3: ( ( (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' ) ) )
            // InternalMyunodsl.g:676:4: ( (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' ) )
            {
            // InternalMyunodsl.g:676:4: ( (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' ) )
            // InternalMyunodsl.g:677:5: (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' )
            {
            // InternalMyunodsl.g:677:5: (lv_main_3_1= '1 main' | lv_main_3_2= 'Plusieurs mains' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyunodsl.g:678:6: lv_main_3_1= '1 main'
                    {
                    lv_main_3_1=(Token)match(input,25,FOLLOW_14); 

                    						newLeafNode(lv_main_3_1, grammarAccess.getNombre_de_mains_de_departAccess().getMain1MainKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombre_de_mains_de_departRule());
                    						}
                    						setWithLastConsumed(current, "main", lv_main_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:689:6: lv_main_3_2= 'Plusieurs mains'
                    {
                    lv_main_3_2=(Token)match(input,26,FOLLOW_14); 

                    						newLeafNode(lv_main_3_2, grammarAccess.getNombre_de_mains_de_departAccess().getMainPlusieursMainsKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombre_de_mains_de_departRule());
                    						}
                    						setWithLastConsumed(current, "main", lv_main_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNombre_de_mains_de_departAccess().getGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNombre_de_mains_de_depart"


    // $ANTLR start "entryRuleNombre_de_cartes_de_depart"
    // InternalMyunodsl.g:710:1: entryRuleNombre_de_cartes_de_depart returns [EObject current=null] : iv_ruleNombre_de_cartes_de_depart= ruleNombre_de_cartes_de_depart EOF ;
    public final EObject entryRuleNombre_de_cartes_de_depart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNombre_de_cartes_de_depart = null;


        try {
            // InternalMyunodsl.g:710:67: (iv_ruleNombre_de_cartes_de_depart= ruleNombre_de_cartes_de_depart EOF )
            // InternalMyunodsl.g:711:2: iv_ruleNombre_de_cartes_de_depart= ruleNombre_de_cartes_de_depart EOF
            {
             newCompositeNode(grammarAccess.getNombre_de_cartes_de_departRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNombre_de_cartes_de_depart=ruleNombre_de_cartes_de_depart();

            state._fsp--;

             current =iv_ruleNombre_de_cartes_de_depart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNombre_de_cartes_de_depart"


    // $ANTLR start "ruleNombre_de_cartes_de_depart"
    // InternalMyunodsl.g:717:1: ruleNombre_de_cartes_de_depart returns [EObject current=null] : (otherlv_0= '<' ( (lv_nbc_1_0= 'Nombre de cartes de depart' ) ) otherlv_2= ':' ( ( (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' ) ) ) otherlv_4= 'cartes' otherlv_5= '>' ) ;
    public final EObject ruleNombre_de_cartes_de_depart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nbc_1_0=null;
        Token otherlv_2=null;
        Token lv_cartes_3_1=null;
        Token lv_cartes_3_2=null;
        Token lv_cartes_3_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:723:2: ( (otherlv_0= '<' ( (lv_nbc_1_0= 'Nombre de cartes de depart' ) ) otherlv_2= ':' ( ( (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' ) ) ) otherlv_4= 'cartes' otherlv_5= '>' ) )
            // InternalMyunodsl.g:724:2: (otherlv_0= '<' ( (lv_nbc_1_0= 'Nombre de cartes de depart' ) ) otherlv_2= ':' ( ( (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' ) ) ) otherlv_4= 'cartes' otherlv_5= '>' )
            {
            // InternalMyunodsl.g:724:2: (otherlv_0= '<' ( (lv_nbc_1_0= 'Nombre de cartes de depart' ) ) otherlv_2= ':' ( ( (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' ) ) ) otherlv_4= 'cartes' otherlv_5= '>' )
            // InternalMyunodsl.g:725:3: otherlv_0= '<' ( (lv_nbc_1_0= 'Nombre de cartes de depart' ) ) otherlv_2= ':' ( ( (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' ) ) ) otherlv_4= 'cartes' otherlv_5= '>'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getNombre_de_cartes_de_departAccess().getLessThanSignKeyword_0());
            		
            // InternalMyunodsl.g:729:3: ( (lv_nbc_1_0= 'Nombre de cartes de depart' ) )
            // InternalMyunodsl.g:730:4: (lv_nbc_1_0= 'Nombre de cartes de depart' )
            {
            // InternalMyunodsl.g:730:4: (lv_nbc_1_0= 'Nombre de cartes de depart' )
            // InternalMyunodsl.g:731:5: lv_nbc_1_0= 'Nombre de cartes de depart'
            {
            lv_nbc_1_0=(Token)match(input,27,FOLLOW_12); 

            					newLeafNode(lv_nbc_1_0, grammarAccess.getNombre_de_cartes_de_departAccess().getNbcNombreDeCartesDeDepartKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNombre_de_cartes_de_departRule());
            					}
            					setWithLastConsumed(current, "nbc", lv_nbc_1_0, "Nombre de cartes de depart");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getNombre_de_cartes_de_departAccess().getColonKeyword_2());
            		
            // InternalMyunodsl.g:747:3: ( ( (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' ) ) )
            // InternalMyunodsl.g:748:4: ( (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' ) )
            {
            // InternalMyunodsl.g:748:4: ( (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' ) )
            // InternalMyunodsl.g:749:5: (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' )
            {
            // InternalMyunodsl.g:749:5: (lv_cartes_3_1= '7' | lv_cartes_3_2= '4' | lv_cartes_3_3= '7-15' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyunodsl.g:750:6: lv_cartes_3_1= '7'
                    {
                    lv_cartes_3_1=(Token)match(input,28,FOLLOW_19); 

                    						newLeafNode(lv_cartes_3_1, grammarAccess.getNombre_de_cartes_de_departAccess().getCartes7Keyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombre_de_cartes_de_departRule());
                    						}
                    						setWithLastConsumed(current, "cartes", lv_cartes_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:761:6: lv_cartes_3_2= '4'
                    {
                    lv_cartes_3_2=(Token)match(input,29,FOLLOW_19); 

                    						newLeafNode(lv_cartes_3_2, grammarAccess.getNombre_de_cartes_de_departAccess().getCartes4Keyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombre_de_cartes_de_departRule());
                    						}
                    						setWithLastConsumed(current, "cartes", lv_cartes_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyunodsl.g:772:6: lv_cartes_3_3= '7-15'
                    {
                    lv_cartes_3_3=(Token)match(input,30,FOLLOW_19); 

                    						newLeafNode(lv_cartes_3_3, grammarAccess.getNombre_de_cartes_de_departAccess().getCartes715Keyword_3_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombre_de_cartes_de_departRule());
                    						}
                    						setWithLastConsumed(current, "cartes", lv_cartes_3_3, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getNombre_de_cartes_de_departAccess().getCartesKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNombre_de_cartes_de_departAccess().getGreaterThanSignKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNombre_de_cartes_de_depart"


    // $ANTLR start "entryRuleNombre_de_Talons_de_depart"
    // InternalMyunodsl.g:797:1: entryRuleNombre_de_Talons_de_depart returns [EObject current=null] : iv_ruleNombre_de_Talons_de_depart= ruleNombre_de_Talons_de_depart EOF ;
    public final EObject entryRuleNombre_de_Talons_de_depart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNombre_de_Talons_de_depart = null;


        try {
            // InternalMyunodsl.g:797:67: (iv_ruleNombre_de_Talons_de_depart= ruleNombre_de_Talons_de_depart EOF )
            // InternalMyunodsl.g:798:2: iv_ruleNombre_de_Talons_de_depart= ruleNombre_de_Talons_de_depart EOF
            {
             newCompositeNode(grammarAccess.getNombre_de_Talons_de_departRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNombre_de_Talons_de_depart=ruleNombre_de_Talons_de_depart();

            state._fsp--;

             current =iv_ruleNombre_de_Talons_de_depart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNombre_de_Talons_de_depart"


    // $ANTLR start "ruleNombre_de_Talons_de_depart"
    // InternalMyunodsl.g:804:1: ruleNombre_de_Talons_de_depart returns [EObject current=null] : ( ( (lv_nbtalon_0_0= 'Nombre de talons' ) ) otherlv_1= '{' ( ( (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' ) ) ) otherlv_3= '}' ) ;
    public final EObject ruleNombre_de_Talons_de_depart() throws RecognitionException {
        EObject current = null;

        Token lv_nbtalon_0_0=null;
        Token otherlv_1=null;
        Token lv_talon_2_1=null;
        Token lv_talon_2_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:810:2: ( ( ( (lv_nbtalon_0_0= 'Nombre de talons' ) ) otherlv_1= '{' ( ( (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' ) ) ) otherlv_3= '}' ) )
            // InternalMyunodsl.g:811:2: ( ( (lv_nbtalon_0_0= 'Nombre de talons' ) ) otherlv_1= '{' ( ( (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' ) ) ) otherlv_3= '}' )
            {
            // InternalMyunodsl.g:811:2: ( ( (lv_nbtalon_0_0= 'Nombre de talons' ) ) otherlv_1= '{' ( ( (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' ) ) ) otherlv_3= '}' )
            // InternalMyunodsl.g:812:3: ( (lv_nbtalon_0_0= 'Nombre de talons' ) ) otherlv_1= '{' ( ( (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' ) ) ) otherlv_3= '}'
            {
            // InternalMyunodsl.g:812:3: ( (lv_nbtalon_0_0= 'Nombre de talons' ) )
            // InternalMyunodsl.g:813:4: (lv_nbtalon_0_0= 'Nombre de talons' )
            {
            // InternalMyunodsl.g:813:4: (lv_nbtalon_0_0= 'Nombre de talons' )
            // InternalMyunodsl.g:814:5: lv_nbtalon_0_0= 'Nombre de talons'
            {
            lv_nbtalon_0_0=(Token)match(input,32,FOLLOW_3); 

            					newLeafNode(lv_nbtalon_0_0, grammarAccess.getNombre_de_Talons_de_departAccess().getNbtalonNombreDeTalonsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNombre_de_Talons_de_departRule());
            					}
            					setWithLastConsumed(current, "nbtalon", lv_nbtalon_0_0, "Nombre de talons");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getNombre_de_Talons_de_departAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:830:3: ( ( (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' ) ) )
            // InternalMyunodsl.g:831:4: ( (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' ) )
            {
            // InternalMyunodsl.g:831:4: ( (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' ) )
            // InternalMyunodsl.g:832:5: (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' )
            {
            // InternalMyunodsl.g:832:5: (lv_talon_2_1= '1 talon' | lv_talon_2_2= '3 talons' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==34) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyunodsl.g:833:6: lv_talon_2_1= '1 talon'
                    {
                    lv_talon_2_1=(Token)match(input,33,FOLLOW_21); 

                    						newLeafNode(lv_talon_2_1, grammarAccess.getNombre_de_Talons_de_departAccess().getTalon1TalonKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombre_de_Talons_de_departRule());
                    						}
                    						setWithLastConsumed(current, "talon", lv_talon_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:844:6: lv_talon_2_2= '3 talons'
                    {
                    lv_talon_2_2=(Token)match(input,34,FOLLOW_21); 

                    						newLeafNode(lv_talon_2_2, grammarAccess.getNombre_de_Talons_de_departAccess().getTalon3TalonsKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombre_de_Talons_de_departRule());
                    						}
                    						setWithLastConsumed(current, "talon", lv_talon_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNombre_de_Talons_de_departAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNombre_de_Talons_de_depart"


    // $ANTLR start "entryRuleRotation"
    // InternalMyunodsl.g:865:1: entryRuleRotation returns [EObject current=null] : iv_ruleRotation= ruleRotation EOF ;
    public final EObject entryRuleRotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotation = null;


        try {
            // InternalMyunodsl.g:865:49: (iv_ruleRotation= ruleRotation EOF )
            // InternalMyunodsl.g:866:2: iv_ruleRotation= ruleRotation EOF
            {
             newCompositeNode(grammarAccess.getRotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotation=ruleRotation();

            state._fsp--;

             current =iv_ruleRotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotation"


    // $ANTLR start "ruleRotation"
    // InternalMyunodsl.g:872:1: ruleRotation returns [EObject current=null] : ( ( (lv_rotation_0_0= 'Rotation' ) ) otherlv_1= '{' ( ( (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' ) ) ) otherlv_3= '}' ) ;
    public final EObject ruleRotation() throws RecognitionException {
        EObject current = null;

        Token lv_rotation_0_0=null;
        Token otherlv_1=null;
        Token lv_s1_2_1=null;
        Token lv_s1_2_2=null;
        Token lv_s1_2_3=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:878:2: ( ( ( (lv_rotation_0_0= 'Rotation' ) ) otherlv_1= '{' ( ( (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' ) ) ) otherlv_3= '}' ) )
            // InternalMyunodsl.g:879:2: ( ( (lv_rotation_0_0= 'Rotation' ) ) otherlv_1= '{' ( ( (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' ) ) ) otherlv_3= '}' )
            {
            // InternalMyunodsl.g:879:2: ( ( (lv_rotation_0_0= 'Rotation' ) ) otherlv_1= '{' ( ( (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' ) ) ) otherlv_3= '}' )
            // InternalMyunodsl.g:880:3: ( (lv_rotation_0_0= 'Rotation' ) ) otherlv_1= '{' ( ( (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' ) ) ) otherlv_3= '}'
            {
            // InternalMyunodsl.g:880:3: ( (lv_rotation_0_0= 'Rotation' ) )
            // InternalMyunodsl.g:881:4: (lv_rotation_0_0= 'Rotation' )
            {
            // InternalMyunodsl.g:881:4: (lv_rotation_0_0= 'Rotation' )
            // InternalMyunodsl.g:882:5: lv_rotation_0_0= 'Rotation'
            {
            lv_rotation_0_0=(Token)match(input,35,FOLLOW_3); 

            					newLeafNode(lv_rotation_0_0, grammarAccess.getRotationAccess().getRotationRotationKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotationRule());
            					}
            					setWithLastConsumed(current, "rotation", lv_rotation_0_0, "Rotation");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:898:3: ( ( (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' ) ) )
            // InternalMyunodsl.g:899:4: ( (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' ) )
            {
            // InternalMyunodsl.g:899:4: ( (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' ) )
            // InternalMyunodsl.g:900:5: (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' )
            {
            // InternalMyunodsl.g:900:5: (lv_s1_2_1= 'Sens des aiguilles d une montre' | lv_s1_2_2= 'Sens contraire des aiguilles d une montre' | lv_s1_2_3= 'Sens de distribution' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt8=1;
                }
                break;
            case 37:
                {
                alt8=2;
                }
                break;
            case 38:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyunodsl.g:901:6: lv_s1_2_1= 'Sens des aiguilles d une montre'
                    {
                    lv_s1_2_1=(Token)match(input,36,FOLLOW_21); 

                    						newLeafNode(lv_s1_2_1, grammarAccess.getRotationAccess().getS1SensDesAiguillesDUneMontreKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRotationRule());
                    						}
                    						setWithLastConsumed(current, "s1", lv_s1_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:912:6: lv_s1_2_2= 'Sens contraire des aiguilles d une montre'
                    {
                    lv_s1_2_2=(Token)match(input,37,FOLLOW_21); 

                    						newLeafNode(lv_s1_2_2, grammarAccess.getRotationAccess().getS1SensContraireDesAiguillesDUneMontreKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRotationRule());
                    						}
                    						setWithLastConsumed(current, "s1", lv_s1_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyunodsl.g:923:6: lv_s1_2_3= 'Sens de distribution'
                    {
                    lv_s1_2_3=(Token)match(input,38,FOLLOW_21); 

                    						newLeafNode(lv_s1_2_3, grammarAccess.getRotationAccess().getS1SensDeDistributionKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRotationRule());
                    						}
                    						setWithLastConsumed(current, "s1", lv_s1_2_3, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotation"


    // $ANTLR start "entryRuleNbjoueur"
    // InternalMyunodsl.g:944:1: entryRuleNbjoueur returns [EObject current=null] : iv_ruleNbjoueur= ruleNbjoueur EOF ;
    public final EObject entryRuleNbjoueur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNbjoueur = null;


        try {
            // InternalMyunodsl.g:944:49: (iv_ruleNbjoueur= ruleNbjoueur EOF )
            // InternalMyunodsl.g:945:2: iv_ruleNbjoueur= ruleNbjoueur EOF
            {
             newCompositeNode(grammarAccess.getNbjoueurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNbjoueur=ruleNbjoueur();

            state._fsp--;

             current =iv_ruleNbjoueur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNbjoueur"


    // $ANTLR start "ruleNbjoueur"
    // InternalMyunodsl.g:951:1: ruleNbjoueur returns [EObject current=null] : ( ( (lv_nbj_0_0= 'Nombre de joueur' ) ) otherlv_1= ':' ( ( (lv_n_2_1= '3-10' | lv_n_2_2= '2' ) ) ) ) ;
    public final EObject ruleNbjoueur() throws RecognitionException {
        EObject current = null;

        Token lv_nbj_0_0=null;
        Token otherlv_1=null;
        Token lv_n_2_1=null;
        Token lv_n_2_2=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:957:2: ( ( ( (lv_nbj_0_0= 'Nombre de joueur' ) ) otherlv_1= ':' ( ( (lv_n_2_1= '3-10' | lv_n_2_2= '2' ) ) ) ) )
            // InternalMyunodsl.g:958:2: ( ( (lv_nbj_0_0= 'Nombre de joueur' ) ) otherlv_1= ':' ( ( (lv_n_2_1= '3-10' | lv_n_2_2= '2' ) ) ) )
            {
            // InternalMyunodsl.g:958:2: ( ( (lv_nbj_0_0= 'Nombre de joueur' ) ) otherlv_1= ':' ( ( (lv_n_2_1= '3-10' | lv_n_2_2= '2' ) ) ) )
            // InternalMyunodsl.g:959:3: ( (lv_nbj_0_0= 'Nombre de joueur' ) ) otherlv_1= ':' ( ( (lv_n_2_1= '3-10' | lv_n_2_2= '2' ) ) )
            {
            // InternalMyunodsl.g:959:3: ( (lv_nbj_0_0= 'Nombre de joueur' ) )
            // InternalMyunodsl.g:960:4: (lv_nbj_0_0= 'Nombre de joueur' )
            {
            // InternalMyunodsl.g:960:4: (lv_nbj_0_0= 'Nombre de joueur' )
            // InternalMyunodsl.g:961:5: lv_nbj_0_0= 'Nombre de joueur'
            {
            lv_nbj_0_0=(Token)match(input,39,FOLLOW_12); 

            					newLeafNode(lv_nbj_0_0, grammarAccess.getNbjoueurAccess().getNbjNombreDeJoueurKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNbjoueurRule());
            					}
            					setWithLastConsumed(current, "nbj", lv_nbj_0_0, "Nombre de joueur");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getNbjoueurAccess().getColonKeyword_1());
            		
            // InternalMyunodsl.g:977:3: ( ( (lv_n_2_1= '3-10' | lv_n_2_2= '2' ) ) )
            // InternalMyunodsl.g:978:4: ( (lv_n_2_1= '3-10' | lv_n_2_2= '2' ) )
            {
            // InternalMyunodsl.g:978:4: ( (lv_n_2_1= '3-10' | lv_n_2_2= '2' ) )
            // InternalMyunodsl.g:979:5: (lv_n_2_1= '3-10' | lv_n_2_2= '2' )
            {
            // InternalMyunodsl.g:979:5: (lv_n_2_1= '3-10' | lv_n_2_2= '2' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==40) ) {
                alt9=1;
            }
            else if ( (LA9_0==41) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyunodsl.g:980:6: lv_n_2_1= '3-10'
                    {
                    lv_n_2_1=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_n_2_1, grammarAccess.getNbjoueurAccess().getN310Keyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNbjoueurRule());
                    						}
                    						setWithLastConsumed(current, "n", lv_n_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:991:6: lv_n_2_2= '2'
                    {
                    lv_n_2_2=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_n_2_2, grammarAccess.getNbjoueurAccess().getN2Keyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNbjoueurRule());
                    						}
                    						setWithLastConsumed(current, "n", lv_n_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNbjoueur"


    // $ANTLR start "entryRuleEquipe"
    // InternalMyunodsl.g:1008:1: entryRuleEquipe returns [EObject current=null] : iv_ruleEquipe= ruleEquipe EOF ;
    public final EObject entryRuleEquipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquipe = null;


        try {
            // InternalMyunodsl.g:1008:47: (iv_ruleEquipe= ruleEquipe EOF )
            // InternalMyunodsl.g:1009:2: iv_ruleEquipe= ruleEquipe EOF
            {
             newCompositeNode(grammarAccess.getEquipeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquipe=ruleEquipe();

            state._fsp--;

             current =iv_ruleEquipe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquipe"


    // $ANTLR start "ruleEquipe"
    // InternalMyunodsl.g:1015:1: ruleEquipe returns [EObject current=null] : ( ( (lv_jeu_0_0= 'Jeu' ) ) otherlv_1= ':' ( ( (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' ) ) ) ) ;
    public final EObject ruleEquipe() throws RecognitionException {
        EObject current = null;

        Token lv_jeu_0_0=null;
        Token otherlv_1=null;
        Token lv_eq_2_1=null;
        Token lv_eq_2_2=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:1021:2: ( ( ( (lv_jeu_0_0= 'Jeu' ) ) otherlv_1= ':' ( ( (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' ) ) ) ) )
            // InternalMyunodsl.g:1022:2: ( ( (lv_jeu_0_0= 'Jeu' ) ) otherlv_1= ':' ( ( (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' ) ) ) )
            {
            // InternalMyunodsl.g:1022:2: ( ( (lv_jeu_0_0= 'Jeu' ) ) otherlv_1= ':' ( ( (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' ) ) ) )
            // InternalMyunodsl.g:1023:3: ( (lv_jeu_0_0= 'Jeu' ) ) otherlv_1= ':' ( ( (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' ) ) )
            {
            // InternalMyunodsl.g:1023:3: ( (lv_jeu_0_0= 'Jeu' ) )
            // InternalMyunodsl.g:1024:4: (lv_jeu_0_0= 'Jeu' )
            {
            // InternalMyunodsl.g:1024:4: (lv_jeu_0_0= 'Jeu' )
            // InternalMyunodsl.g:1025:5: lv_jeu_0_0= 'Jeu'
            {
            lv_jeu_0_0=(Token)match(input,42,FOLLOW_12); 

            					newLeafNode(lv_jeu_0_0, grammarAccess.getEquipeAccess().getJeuJeuKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEquipeRule());
            					}
            					setWithLastConsumed(current, "jeu", lv_jeu_0_0, "Jeu");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEquipeAccess().getColonKeyword_1());
            		
            // InternalMyunodsl.g:1041:3: ( ( (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' ) ) )
            // InternalMyunodsl.g:1042:4: ( (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' ) )
            {
            // InternalMyunodsl.g:1042:4: ( (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' ) )
            // InternalMyunodsl.g:1043:5: (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' )
            {
            // InternalMyunodsl.g:1043:5: (lv_eq_2_1= 'Solo' | lv_eq_2_2= 'Equipes' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==44) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyunodsl.g:1044:6: lv_eq_2_1= 'Solo'
                    {
                    lv_eq_2_1=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_eq_2_1, grammarAccess.getEquipeAccess().getEqSoloKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEquipeRule());
                    						}
                    						setWithLastConsumed(current, "eq", lv_eq_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:1055:6: lv_eq_2_2= 'Equipes'
                    {
                    lv_eq_2_2=(Token)match(input,44,FOLLOW_2); 

                    						newLeafNode(lv_eq_2_2, grammarAccess.getEquipeAccess().getEqEquipesKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEquipeRule());
                    						}
                    						setWithLastConsumed(current, "eq", lv_eq_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquipe"


    // $ANTLR start "entryRuleDeroulement"
    // InternalMyunodsl.g:1072:1: entryRuleDeroulement returns [EObject current=null] : iv_ruleDeroulement= ruleDeroulement EOF ;
    public final EObject entryRuleDeroulement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeroulement = null;


        try {
            // InternalMyunodsl.g:1072:52: (iv_ruleDeroulement= ruleDeroulement EOF )
            // InternalMyunodsl.g:1073:2: iv_ruleDeroulement= ruleDeroulement EOF
            {
             newCompositeNode(grammarAccess.getDeroulementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeroulement=ruleDeroulement();

            state._fsp--;

             current =iv_ruleDeroulement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeroulement"


    // $ANTLR start "ruleDeroulement"
    // InternalMyunodsl.g:1079:1: ruleDeroulement returns [EObject current=null] : ( ( (lv_der_0_0= 'Deroulement' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?) ) ) otherlv_6= ']' ) ;
    public final EObject ruleDeroulement() throws RecognitionException {
        EObject current = null;

        Token lv_der_0_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_piocher_3_0 = null;

        EObject lv_cartes_4_0 = null;

        EObject lv_penaliter_5_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:1085:2: ( ( ( (lv_der_0_0= 'Deroulement' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?) ) ) otherlv_6= ']' ) )
            // InternalMyunodsl.g:1086:2: ( ( (lv_der_0_0= 'Deroulement' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?) ) ) otherlv_6= ']' )
            {
            // InternalMyunodsl.g:1086:2: ( ( (lv_der_0_0= 'Deroulement' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?) ) ) otherlv_6= ']' )
            // InternalMyunodsl.g:1087:3: ( (lv_der_0_0= 'Deroulement' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?) ) ) otherlv_6= ']'
            {
            // InternalMyunodsl.g:1087:3: ( (lv_der_0_0= 'Deroulement' ) )
            // InternalMyunodsl.g:1088:4: (lv_der_0_0= 'Deroulement' )
            {
            // InternalMyunodsl.g:1088:4: (lv_der_0_0= 'Deroulement' )
            // InternalMyunodsl.g:1089:5: lv_der_0_0= 'Deroulement'
            {
            lv_der_0_0=(Token)match(input,45,FOLLOW_6); 

            					newLeafNode(lv_der_0_0, grammarAccess.getDeroulementAccess().getDerDeroulementKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeroulementRule());
            					}
            					setWithLastConsumed(current, "der", lv_der_0_0, "Deroulement");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getDeroulementAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyunodsl.g:1105:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?) ) )
            // InternalMyunodsl.g:1106:4: ( ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyunodsl.g:1106:4: ( ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?) )
            // InternalMyunodsl.g:1107:5: ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDeroulementAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:1110:5: ( ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?)
            // InternalMyunodsl.g:1111:6: ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+ {...}?
            {
            // InternalMyunodsl.g:1111:6: ( ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 2) ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyunodsl.g:1112:4: ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1112:4: ({...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) ) )
            	    // InternalMyunodsl.g:1113:5: {...}? => ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDeroulement", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:1113:108: ( ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) ) )
            	    // InternalMyunodsl.g:1114:6: ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:1117:9: ({...}? => ( (lv_piocher_3_0= rulePiocher ) ) )
            	    // InternalMyunodsl.g:1117:10: {...}? => ( (lv_piocher_3_0= rulePiocher ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeroulement", "true");
            	    }
            	    // InternalMyunodsl.g:1117:19: ( (lv_piocher_3_0= rulePiocher ) )
            	    // InternalMyunodsl.g:1117:20: (lv_piocher_3_0= rulePiocher )
            	    {
            	    // InternalMyunodsl.g:1117:20: (lv_piocher_3_0= rulePiocher )
            	    // InternalMyunodsl.g:1118:10: lv_piocher_3_0= rulePiocher
            	    {

            	    										newCompositeNode(grammarAccess.getDeroulementAccess().getPiocherPiocherParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_26);
            	    lv_piocher_3_0=rulePiocher();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDeroulementRule());
            	    										}
            	    										set(
            	    											current,
            	    											"piocher",
            	    											lv_piocher_3_0,
            	    											"org.example.myunodsl.Myunodsl.Piocher");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeroulementAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:1140:4: ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1140:4: ({...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) ) )
            	    // InternalMyunodsl.g:1141:5: {...}? => ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDeroulement", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:1141:108: ( ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) ) )
            	    // InternalMyunodsl.g:1142:6: ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:1145:9: ({...}? => ( (lv_cartes_4_0= ruleCartes ) ) )
            	    // InternalMyunodsl.g:1145:10: {...}? => ( (lv_cartes_4_0= ruleCartes ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeroulement", "true");
            	    }
            	    // InternalMyunodsl.g:1145:19: ( (lv_cartes_4_0= ruleCartes ) )
            	    // InternalMyunodsl.g:1145:20: (lv_cartes_4_0= ruleCartes )
            	    {
            	    // InternalMyunodsl.g:1145:20: (lv_cartes_4_0= ruleCartes )
            	    // InternalMyunodsl.g:1146:10: lv_cartes_4_0= ruleCartes
            	    {

            	    										newCompositeNode(grammarAccess.getDeroulementAccess().getCartesCartesParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_26);
            	    lv_cartes_4_0=ruleCartes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDeroulementRule());
            	    										}
            	    										set(
            	    											current,
            	    											"cartes",
            	    											lv_cartes_4_0,
            	    											"org.example.myunodsl.Myunodsl.Cartes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeroulementAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyunodsl.g:1168:4: ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1168:4: ({...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) ) )
            	    // InternalMyunodsl.g:1169:5: {...}? => ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDeroulement", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyunodsl.g:1169:108: ( ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) ) )
            	    // InternalMyunodsl.g:1170:6: ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDeroulementAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyunodsl.g:1173:9: ({...}? => ( (lv_penaliter_5_0= rulePenalite ) ) )
            	    // InternalMyunodsl.g:1173:10: {...}? => ( (lv_penaliter_5_0= rulePenalite ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeroulement", "true");
            	    }
            	    // InternalMyunodsl.g:1173:19: ( (lv_penaliter_5_0= rulePenalite ) )
            	    // InternalMyunodsl.g:1173:20: (lv_penaliter_5_0= rulePenalite )
            	    {
            	    // InternalMyunodsl.g:1173:20: (lv_penaliter_5_0= rulePenalite )
            	    // InternalMyunodsl.g:1174:10: lv_penaliter_5_0= rulePenalite
            	    {

            	    										newCompositeNode(grammarAccess.getDeroulementAccess().getPenaliterPenaliteParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_26);
            	    lv_penaliter_5_0=rulePenalite();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDeroulementRule());
            	    										}
            	    										set(
            	    											current,
            	    											"penaliter",
            	    											lv_penaliter_5_0,
            	    											"org.example.myunodsl.Myunodsl.Penalite");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeroulementAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDeroulementAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleDeroulement", "getUnorderedGroupHelper().canLeave(grammarAccess.getDeroulementAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDeroulementAccess().getUnorderedGroup_2());
            				

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDeroulementAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeroulement"


    // $ANTLR start "entryRulePiocher"
    // InternalMyunodsl.g:1212:1: entryRulePiocher returns [EObject current=null] : iv_rulePiocher= rulePiocher EOF ;
    public final EObject entryRulePiocher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePiocher = null;


        try {
            // InternalMyunodsl.g:1212:48: (iv_rulePiocher= rulePiocher EOF )
            // InternalMyunodsl.g:1213:2: iv_rulePiocher= rulePiocher EOF
            {
             newCompositeNode(grammarAccess.getPiocherRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePiocher=rulePiocher();

            state._fsp--;

             current =iv_rulePiocher; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePiocher"


    // $ANTLR start "rulePiocher"
    // InternalMyunodsl.g:1219:1: rulePiocher returns [EObject current=null] : ( ( (lv_pio_0_0= 'Piocher' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}' ) ;
    public final EObject rulePiocher() throws RecognitionException {
        EObject current = null;

        Token lv_pio_0_0=null;
        Token otherlv_1=null;
        Token lv_optp_4_0=null;
        Token otherlv_5=null;
        EObject lv_nbr_3_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:1225:2: ( ( ( (lv_pio_0_0= 'Piocher' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}' ) )
            // InternalMyunodsl.g:1226:2: ( ( (lv_pio_0_0= 'Piocher' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}' )
            {
            // InternalMyunodsl.g:1226:2: ( ( (lv_pio_0_0= 'Piocher' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}' )
            // InternalMyunodsl.g:1227:3: ( (lv_pio_0_0= 'Piocher' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}'
            {
            // InternalMyunodsl.g:1227:3: ( (lv_pio_0_0= 'Piocher' ) )
            // InternalMyunodsl.g:1228:4: (lv_pio_0_0= 'Piocher' )
            {
            // InternalMyunodsl.g:1228:4: (lv_pio_0_0= 'Piocher' )
            // InternalMyunodsl.g:1229:5: lv_pio_0_0= 'Piocher'
            {
            lv_pio_0_0=(Token)match(input,46,FOLLOW_3); 

            					newLeafNode(lv_pio_0_0, grammarAccess.getPiocherAccess().getPioPiocherKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPiocherRule());
            					}
            					setWithLastConsumed(current, "pio", lv_pio_0_0, "Piocher");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getPiocherAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:1245:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?) ) )
            // InternalMyunodsl.g:1246:4: ( ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyunodsl.g:1246:4: ( ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?) )
            // InternalMyunodsl.g:1247:5: ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPiocherAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:1250:5: ( ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?)
            // InternalMyunodsl.g:1251:6: ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+ {...}?
            {
            // InternalMyunodsl.g:1251:6: ( ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPiocherAccess().getUnorderedGroup_2(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPiocherAccess().getUnorderedGroup_2(), 1) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyunodsl.g:1252:4: ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1252:4: ({...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) ) )
            	    // InternalMyunodsl.g:1253:5: {...}? => ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiocherAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePiocher", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiocherAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:1253:104: ( ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) ) )
            	    // InternalMyunodsl.g:1254:6: ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiocherAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:1257:9: ({...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) ) )
            	    // InternalMyunodsl.g:1257:10: {...}? => ( (lv_nbr_3_0= ruleNombre_de_carte ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiocher", "true");
            	    }
            	    // InternalMyunodsl.g:1257:19: ( (lv_nbr_3_0= ruleNombre_de_carte ) )
            	    // InternalMyunodsl.g:1257:20: (lv_nbr_3_0= ruleNombre_de_carte )
            	    {
            	    // InternalMyunodsl.g:1257:20: (lv_nbr_3_0= ruleNombre_de_carte )
            	    // InternalMyunodsl.g:1258:10: lv_nbr_3_0= ruleNombre_de_carte
            	    {

            	    										newCompositeNode(grammarAccess.getPiocherAccess().getNbrNombre_de_carteParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_28);
            	    lv_nbr_3_0=ruleNombre_de_carte();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPiocherRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nbr",
            	    											lv_nbr_3_0,
            	    											"org.example.myunodsl.Myunodsl.Nombre_de_carte");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiocherAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:1280:4: ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1280:4: ({...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) ) )
            	    // InternalMyunodsl.g:1281:5: {...}? => ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPiocherAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePiocher", "getUnorderedGroupHelper().canSelect(grammarAccess.getPiocherAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:1281:104: ( ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) ) )
            	    // InternalMyunodsl.g:1282:6: ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPiocherAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:1285:9: ({...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) ) )
            	    // InternalMyunodsl.g:1285:10: {...}? => ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePiocher", "true");
            	    }
            	    // InternalMyunodsl.g:1285:19: ( (lv_optp_4_0= 'seulement si on ne peut pas jouer' ) )
            	    // InternalMyunodsl.g:1285:20: (lv_optp_4_0= 'seulement si on ne peut pas jouer' )
            	    {
            	    // InternalMyunodsl.g:1285:20: (lv_optp_4_0= 'seulement si on ne peut pas jouer' )
            	    // InternalMyunodsl.g:1286:10: lv_optp_4_0= 'seulement si on ne peut pas jouer'
            	    {
            	    lv_optp_4_0=(Token)match(input,47,FOLLOW_28); 

            	    										newLeafNode(lv_optp_4_0, grammarAccess.getPiocherAccess().getOptpSeulementSiOnNePeutPasJouerKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPiocherRule());
            	    										}
            	    										setWithLastConsumed(current, "optp", lv_optp_4_0, "seulement si on ne peut pas jouer");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPiocherAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPiocherAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rulePiocher", "getUnorderedGroupHelper().canLeave(grammarAccess.getPiocherAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPiocherAccess().getUnorderedGroup_2());
            				

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPiocherAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePiocher"


    // $ANTLR start "entryRuleNombre_de_carte"
    // InternalMyunodsl.g:1319:1: entryRuleNombre_de_carte returns [EObject current=null] : iv_ruleNombre_de_carte= ruleNombre_de_carte EOF ;
    public final EObject entryRuleNombre_de_carte() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNombre_de_carte = null;


        try {
            // InternalMyunodsl.g:1319:56: (iv_ruleNombre_de_carte= ruleNombre_de_carte EOF )
            // InternalMyunodsl.g:1320:2: iv_ruleNombre_de_carte= ruleNombre_de_carte EOF
            {
             newCompositeNode(grammarAccess.getNombre_de_carteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNombre_de_carte=ruleNombre_de_carte();

            state._fsp--;

             current =iv_ruleNombre_de_carte; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNombre_de_carte"


    // $ANTLR start "ruleNombre_de_carte"
    // InternalMyunodsl.g:1326:1: ruleNombre_de_carte returns [EObject current=null] : ( ( (lv_nbc_0_0= 'Nombre de carte' ) ) otherlv_1= ':' ( ( (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' ) ) ) ) ;
    public final EObject ruleNombre_de_carte() throws RecognitionException {
        EObject current = null;

        Token lv_nbc_0_0=null;
        Token otherlv_1=null;
        Token lv_ca_2_1=null;
        Token lv_ca_2_2=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:1332:2: ( ( ( (lv_nbc_0_0= 'Nombre de carte' ) ) otherlv_1= ':' ( ( (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' ) ) ) ) )
            // InternalMyunodsl.g:1333:2: ( ( (lv_nbc_0_0= 'Nombre de carte' ) ) otherlv_1= ':' ( ( (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' ) ) ) )
            {
            // InternalMyunodsl.g:1333:2: ( ( (lv_nbc_0_0= 'Nombre de carte' ) ) otherlv_1= ':' ( ( (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' ) ) ) )
            // InternalMyunodsl.g:1334:3: ( (lv_nbc_0_0= 'Nombre de carte' ) ) otherlv_1= ':' ( ( (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' ) ) )
            {
            // InternalMyunodsl.g:1334:3: ( (lv_nbc_0_0= 'Nombre de carte' ) )
            // InternalMyunodsl.g:1335:4: (lv_nbc_0_0= 'Nombre de carte' )
            {
            // InternalMyunodsl.g:1335:4: (lv_nbc_0_0= 'Nombre de carte' )
            // InternalMyunodsl.g:1336:5: lv_nbc_0_0= 'Nombre de carte'
            {
            lv_nbc_0_0=(Token)match(input,48,FOLLOW_12); 

            					newLeafNode(lv_nbc_0_0, grammarAccess.getNombre_de_carteAccess().getNbcNombreDeCarteKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNombre_de_carteRule());
            					}
            					setWithLastConsumed(current, "nbc", lv_nbc_0_0, "Nombre de carte");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getNombre_de_carteAccess().getColonKeyword_1());
            		
            // InternalMyunodsl.g:1352:3: ( ( (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' ) ) )
            // InternalMyunodsl.g:1353:4: ( (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' ) )
            {
            // InternalMyunodsl.g:1353:4: ( (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' ) )
            // InternalMyunodsl.g:1354:5: (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' )
            {
            // InternalMyunodsl.g:1354:5: (lv_ca_2_1= '1 carte' | lv_ca_2_2= 'jusqu\\u00E0 3' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            else if ( (LA13_0==50) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyunodsl.g:1355:6: lv_ca_2_1= '1 carte'
                    {
                    lv_ca_2_1=(Token)match(input,49,FOLLOW_2); 

                    						newLeafNode(lv_ca_2_1, grammarAccess.getNombre_de_carteAccess().getCa1CarteKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombre_de_carteRule());
                    						}
                    						setWithLastConsumed(current, "ca", lv_ca_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:1366:6: lv_ca_2_2= 'jusqu\\u00E0 3'
                    {
                    lv_ca_2_2=(Token)match(input,50,FOLLOW_2); 

                    						newLeafNode(lv_ca_2_2, grammarAccess.getNombre_de_carteAccess().getCaJusqu3Keyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombre_de_carteRule());
                    						}
                    						setWithLastConsumed(current, "ca", lv_ca_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNombre_de_carte"


    // $ANTLR start "entryRuleCartes"
    // InternalMyunodsl.g:1383:1: entryRuleCartes returns [EObject current=null] : iv_ruleCartes= ruleCartes EOF ;
    public final EObject entryRuleCartes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCartes = null;


        try {
            // InternalMyunodsl.g:1383:47: (iv_ruleCartes= ruleCartes EOF )
            // InternalMyunodsl.g:1384:2: iv_ruleCartes= ruleCartes EOF
            {
             newCompositeNode(grammarAccess.getCartesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCartes=ruleCartes();

            state._fsp--;

             current =iv_ruleCartes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCartes"


    // $ANTLR start "ruleCartes"
    // InternalMyunodsl.g:1390:1: ruleCartes returns [EObject current=null] : ( ( (lv_ca_0_0= 'cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
    public final EObject ruleCartes() throws RecognitionException {
        EObject current = null;

        Token lv_ca_0_0=null;
        Token otherlv_1=null;
        Token otherlv_8=null;
        EObject lv_cc_3_0 = null;

        EObject lv_jpc_4_0 = null;

        EObject lv_clj_5_0 = null;

        EObject lv_cdm_6_0 = null;

        EObject lv_p_7_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:1396:2: ( ( ( (lv_ca_0_0= 'cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalMyunodsl.g:1397:2: ( ( (lv_ca_0_0= 'cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalMyunodsl.g:1397:2: ( ( (lv_ca_0_0= 'cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalMyunodsl.g:1398:3: ( (lv_ca_0_0= 'cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            // InternalMyunodsl.g:1398:3: ( (lv_ca_0_0= 'cartes' ) )
            // InternalMyunodsl.g:1399:4: (lv_ca_0_0= 'cartes' )
            {
            // InternalMyunodsl.g:1399:4: (lv_ca_0_0= 'cartes' )
            // InternalMyunodsl.g:1400:5: lv_ca_0_0= 'cartes'
            {
            lv_ca_0_0=(Token)match(input,31,FOLLOW_3); 

            					newLeafNode(lv_ca_0_0, grammarAccess.getCartesAccess().getCaCartesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCartesRule());
            					}
            					setWithLastConsumed(current, "ca", lv_ca_0_0, "cartes");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getCartesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:1416:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* ) ) )
            // InternalMyunodsl.g:1417:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* ) )
            {
            // InternalMyunodsl.g:1417:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* ) )
            // InternalMyunodsl.g:1418:5: ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCartesAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:1421:5: ( ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )* )
            // InternalMyunodsl.g:1422:6: ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )*
            {
            // InternalMyunodsl.g:1422:6: ( ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) ) )*
            loop14:
            do {
                int alt14=6;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 3) ) {
                    alt14=4;
                }
                else if ( LA14_0 >= 83 && LA14_0 <= 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 4) ) {
                    alt14=5;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyunodsl.g:1423:4: ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1423:4: ({...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) ) )
            	    // InternalMyunodsl.g:1424:5: {...}? => ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:1424:103: ( ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) ) )
            	    // InternalMyunodsl.g:1425:6: ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:1428:9: ({...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) ) )
            	    // InternalMyunodsl.g:1428:10: {...}? => ( (lv_cc_3_0= ruleCumul_Cartes ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "true");
            	    }
            	    // InternalMyunodsl.g:1428:19: ( (lv_cc_3_0= ruleCumul_Cartes ) )
            	    // InternalMyunodsl.g:1428:20: (lv_cc_3_0= ruleCumul_Cartes )
            	    {
            	    // InternalMyunodsl.g:1428:20: (lv_cc_3_0= ruleCumul_Cartes )
            	    // InternalMyunodsl.g:1429:10: lv_cc_3_0= ruleCumul_Cartes
            	    {

            	    										newCompositeNode(grammarAccess.getCartesAccess().getCcCumul_CartesParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    lv_cc_3_0=ruleCumul_Cartes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCartesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"cc",
            	    											lv_cc_3_0,
            	    											"org.example.myunodsl.Myunodsl.Cumul_Cartes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:1451:4: ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1451:4: ({...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) ) )
            	    // InternalMyunodsl.g:1452:5: {...}? => ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:1452:103: ( ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) ) )
            	    // InternalMyunodsl.g:1453:6: ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:1456:9: ({...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) ) )
            	    // InternalMyunodsl.g:1456:10: {...}? => ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "true");
            	    }
            	    // InternalMyunodsl.g:1456:19: ( (lv_jpc_4_0= ruleJouer_plusieurs_cartes ) )
            	    // InternalMyunodsl.g:1456:20: (lv_jpc_4_0= ruleJouer_plusieurs_cartes )
            	    {
            	    // InternalMyunodsl.g:1456:20: (lv_jpc_4_0= ruleJouer_plusieurs_cartes )
            	    // InternalMyunodsl.g:1457:10: lv_jpc_4_0= ruleJouer_plusieurs_cartes
            	    {

            	    										newCompositeNode(grammarAccess.getCartesAccess().getJpcJouer_plusieurs_cartesParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    lv_jpc_4_0=ruleJouer_plusieurs_cartes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCartesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"jpc",
            	    											lv_jpc_4_0,
            	    											"org.example.myunodsl.Myunodsl.Jouer_plusieurs_cartes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyunodsl.g:1479:4: ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1479:4: ({...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) ) )
            	    // InternalMyunodsl.g:1480:5: {...}? => ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyunodsl.g:1480:103: ( ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) ) )
            	    // InternalMyunodsl.g:1481:6: ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyunodsl.g:1484:9: ({...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) ) )
            	    // InternalMyunodsl.g:1484:10: {...}? => ( (lv_clj_5_0= ruleCouper_le_jeu ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "true");
            	    }
            	    // InternalMyunodsl.g:1484:19: ( (lv_clj_5_0= ruleCouper_le_jeu ) )
            	    // InternalMyunodsl.g:1484:20: (lv_clj_5_0= ruleCouper_le_jeu )
            	    {
            	    // InternalMyunodsl.g:1484:20: (lv_clj_5_0= ruleCouper_le_jeu )
            	    // InternalMyunodsl.g:1485:10: lv_clj_5_0= ruleCouper_le_jeu
            	    {

            	    										newCompositeNode(grammarAccess.getCartesAccess().getCljCouper_le_jeuParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    lv_clj_5_0=ruleCouper_le_jeu();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCartesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"clj",
            	    											lv_clj_5_0,
            	    											"org.example.myunodsl.Myunodsl.Couper_le_jeu");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyunodsl.g:1507:4: ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1507:4: ({...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) ) )
            	    // InternalMyunodsl.g:1508:5: {...}? => ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyunodsl.g:1508:103: ( ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) ) )
            	    // InternalMyunodsl.g:1509:6: ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyunodsl.g:1512:9: ({...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) ) )
            	    // InternalMyunodsl.g:1512:10: {...}? => ( (lv_cdm_6_0= ruleChanger_de_mains ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "true");
            	    }
            	    // InternalMyunodsl.g:1512:19: ( (lv_cdm_6_0= ruleChanger_de_mains ) )
            	    // InternalMyunodsl.g:1512:20: (lv_cdm_6_0= ruleChanger_de_mains )
            	    {
            	    // InternalMyunodsl.g:1512:20: (lv_cdm_6_0= ruleChanger_de_mains )
            	    // InternalMyunodsl.g:1513:10: lv_cdm_6_0= ruleChanger_de_mains
            	    {

            	    										newCompositeNode(grammarAccess.getCartesAccess().getCdmChanger_de_mainsParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    lv_cdm_6_0=ruleChanger_de_mains();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCartesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"cdm",
            	    											lv_cdm_6_0,
            	    											"org.example.myunodsl.Myunodsl.Changer_de_mains");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyunodsl.g:1535:4: ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1535:4: ({...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) ) )
            	    // InternalMyunodsl.g:1536:5: {...}? => ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyunodsl.g:1536:103: ( ({...}? => ( (lv_p_7_0= rulePlus4 ) ) ) )
            	    // InternalMyunodsl.g:1537:6: ({...}? => ( (lv_p_7_0= rulePlus4 ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCartesAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyunodsl.g:1540:9: ({...}? => ( (lv_p_7_0= rulePlus4 ) ) )
            	    // InternalMyunodsl.g:1540:10: {...}? => ( (lv_p_7_0= rulePlus4 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCartes", "true");
            	    }
            	    // InternalMyunodsl.g:1540:19: ( (lv_p_7_0= rulePlus4 ) )
            	    // InternalMyunodsl.g:1540:20: (lv_p_7_0= rulePlus4 )
            	    {
            	    // InternalMyunodsl.g:1540:20: (lv_p_7_0= rulePlus4 )
            	    // InternalMyunodsl.g:1541:10: lv_p_7_0= rulePlus4
            	    {

            	    										newCompositeNode(grammarAccess.getCartesAccess().getPPlus4ParserRuleCall_2_4_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    lv_p_7_0=rulePlus4();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCartesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"p",
            	    											lv_p_7_0,
            	    											"org.example.myunodsl.Myunodsl.Plus4");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCartesAccess().getUnorderedGroup_2());
            				

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCartesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCartes"


    // $ANTLR start "entryRuleCumul_Cartes"
    // InternalMyunodsl.g:1578:1: entryRuleCumul_Cartes returns [EObject current=null] : iv_ruleCumul_Cartes= ruleCumul_Cartes EOF ;
    public final EObject entryRuleCumul_Cartes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCumul_Cartes = null;


        try {
            // InternalMyunodsl.g:1578:53: (iv_ruleCumul_Cartes= ruleCumul_Cartes EOF )
            // InternalMyunodsl.g:1579:2: iv_ruleCumul_Cartes= ruleCumul_Cartes EOF
            {
             newCompositeNode(grammarAccess.getCumul_CartesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCumul_Cartes=ruleCumul_Cartes();

            state._fsp--;

             current =iv_ruleCumul_Cartes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCumul_Cartes"


    // $ANTLR start "ruleCumul_Cartes"
    // InternalMyunodsl.g:1585:1: ruleCumul_Cartes returns [EObject current=null] : ( ( (lv_c_0_0= 'cumul' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_6= '}' ) ;
    public final EObject ruleCumul_Cartes() throws RecognitionException {
        EObject current = null;

        Token lv_c_0_0=null;
        Token otherlv_1=null;
        Token lv_eff_3_0=null;
        Token otherlv_6=null;
        EObject lv_pl2_4_0 = null;

        EObject lv_pl4_5_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:1591:2: ( ( ( (lv_c_0_0= 'cumul' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_6= '}' ) )
            // InternalMyunodsl.g:1592:2: ( ( (lv_c_0_0= 'cumul' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_6= '}' )
            {
            // InternalMyunodsl.g:1592:2: ( ( (lv_c_0_0= 'cumul' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_6= '}' )
            // InternalMyunodsl.g:1593:3: ( (lv_c_0_0= 'cumul' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_6= '}'
            {
            // InternalMyunodsl.g:1593:3: ( (lv_c_0_0= 'cumul' ) )
            // InternalMyunodsl.g:1594:4: (lv_c_0_0= 'cumul' )
            {
            // InternalMyunodsl.g:1594:4: (lv_c_0_0= 'cumul' )
            // InternalMyunodsl.g:1595:5: lv_c_0_0= 'cumul'
            {
            lv_c_0_0=(Token)match(input,51,FOLLOW_3); 

            					newLeafNode(lv_c_0_0, grammarAccess.getCumul_CartesAccess().getCCumulKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCumul_CartesRule());
            					}
            					setWithLastConsumed(current, "c", lv_c_0_0, "cumul");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getCumul_CartesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:1611:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) )
            // InternalMyunodsl.g:1612:4: ( ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* ) )
            {
            // InternalMyunodsl.g:1612:4: ( ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* ) )
            // InternalMyunodsl.g:1613:5: ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:1616:5: ( ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )* )
            // InternalMyunodsl.g:1617:6: ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )*
            {
            // InternalMyunodsl.g:1617:6: ( ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) ) )*
            loop15:
            do {
                int alt15=4;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 >= 85 && LA15_0 <= 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 >= 83 && LA15_0 <= 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 2) ) {
                    alt15=3;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyunodsl.g:1618:4: ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1618:4: ({...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) ) )
            	    // InternalMyunodsl.g:1619:5: {...}? => ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCumul_Cartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:1619:109: ( ({...}? => ( (lv_eff_3_0= 'effet' ) ) ) )
            	    // InternalMyunodsl.g:1620:6: ({...}? => ( (lv_eff_3_0= 'effet' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:1623:9: ({...}? => ( (lv_eff_3_0= 'effet' ) ) )
            	    // InternalMyunodsl.g:1623:10: {...}? => ( (lv_eff_3_0= 'effet' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCumul_Cartes", "true");
            	    }
            	    // InternalMyunodsl.g:1623:19: ( (lv_eff_3_0= 'effet' ) )
            	    // InternalMyunodsl.g:1623:20: (lv_eff_3_0= 'effet' )
            	    {
            	    // InternalMyunodsl.g:1623:20: (lv_eff_3_0= 'effet' )
            	    // InternalMyunodsl.g:1624:10: lv_eff_3_0= 'effet'
            	    {
            	    lv_eff_3_0=(Token)match(input,52,FOLLOW_31); 

            	    										newLeafNode(lv_eff_3_0, grammarAccess.getCumul_CartesAccess().getEffEffetKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getCumul_CartesRule());
            	    										}
            	    										setWithLastConsumed(current, "eff", lv_eff_3_0, "effet");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:1641:4: ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1641:4: ({...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) ) )
            	    // InternalMyunodsl.g:1642:5: {...}? => ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCumul_Cartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:1642:109: ( ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) ) )
            	    // InternalMyunodsl.g:1643:6: ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:1646:9: ({...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) ) )
            	    // InternalMyunodsl.g:1646:10: {...}? => ( (lv_pl2_4_0= rulePLUS_DEUX ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCumul_Cartes", "true");
            	    }
            	    // InternalMyunodsl.g:1646:19: ( (lv_pl2_4_0= rulePLUS_DEUX ) )
            	    // InternalMyunodsl.g:1646:20: (lv_pl2_4_0= rulePLUS_DEUX )
            	    {
            	    // InternalMyunodsl.g:1646:20: (lv_pl2_4_0= rulePLUS_DEUX )
            	    // InternalMyunodsl.g:1647:10: lv_pl2_4_0= rulePLUS_DEUX
            	    {

            	    										newCompositeNode(grammarAccess.getCumul_CartesAccess().getPl2PLUS_DEUXParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_31);
            	    lv_pl2_4_0=rulePLUS_DEUX();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCumul_CartesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"pl2",
            	    											lv_pl2_4_0,
            	    											"org.example.myunodsl.Myunodsl.PLUS_DEUX");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyunodsl.g:1669:4: ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1669:4: ({...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) ) )
            	    // InternalMyunodsl.g:1670:5: {...}? => ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCumul_Cartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyunodsl.g:1670:109: ( ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) ) )
            	    // InternalMyunodsl.g:1671:6: ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyunodsl.g:1674:9: ({...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) ) )
            	    // InternalMyunodsl.g:1674:10: {...}? => ( (lv_pl4_5_0= rulePLUS_QUATRE ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCumul_Cartes", "true");
            	    }
            	    // InternalMyunodsl.g:1674:19: ( (lv_pl4_5_0= rulePLUS_QUATRE ) )
            	    // InternalMyunodsl.g:1674:20: (lv_pl4_5_0= rulePLUS_QUATRE )
            	    {
            	    // InternalMyunodsl.g:1674:20: (lv_pl4_5_0= rulePLUS_QUATRE )
            	    // InternalMyunodsl.g:1675:10: lv_pl4_5_0= rulePLUS_QUATRE
            	    {

            	    										newCompositeNode(grammarAccess.getCumul_CartesAccess().getPl4PLUS_QUATREParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_31);
            	    lv_pl4_5_0=rulePLUS_QUATRE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCumul_CartesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"pl4",
            	    											lv_pl4_5_0,
            	    											"org.example.myunodsl.Myunodsl.PLUS_QUATRE");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCumul_CartesAccess().getUnorderedGroup_2());
            				

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCumul_CartesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCumul_Cartes"


    // $ANTLR start "entryRuleJouer_plusieurs_cartes"
    // InternalMyunodsl.g:1712:1: entryRuleJouer_plusieurs_cartes returns [EObject current=null] : iv_ruleJouer_plusieurs_cartes= ruleJouer_plusieurs_cartes EOF ;
    public final EObject entryRuleJouer_plusieurs_cartes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJouer_plusieurs_cartes = null;


        try {
            // InternalMyunodsl.g:1712:63: (iv_ruleJouer_plusieurs_cartes= ruleJouer_plusieurs_cartes EOF )
            // InternalMyunodsl.g:1713:2: iv_ruleJouer_plusieurs_cartes= ruleJouer_plusieurs_cartes EOF
            {
             newCompositeNode(grammarAccess.getJouer_plusieurs_cartesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJouer_plusieurs_cartes=ruleJouer_plusieurs_cartes();

            state._fsp--;

             current =iv_ruleJouer_plusieurs_cartes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJouer_plusieurs_cartes"


    // $ANTLR start "ruleJouer_plusieurs_cartes"
    // InternalMyunodsl.g:1719:1: ruleJouer_plusieurs_cartes returns [EObject current=null] : ( ( (lv_jpc_0_0= 'Jouer plusieurs cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleJouer_plusieurs_cartes() throws RecognitionException {
        EObject current = null;

        Token lv_jpc_0_0=null;
        Token otherlv_1=null;
        Token lv_c_4_0=null;
        Token lv_nb_5_0=null;
        Token otherlv_7=null;
        EObject lv_s_3_0 = null;

        EObject lv_cus_6_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:1725:2: ( ( ( (lv_jpc_0_0= 'Jouer plusieurs cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* ) ) ) otherlv_7= '}' ) )
            // InternalMyunodsl.g:1726:2: ( ( (lv_jpc_0_0= 'Jouer plusieurs cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            {
            // InternalMyunodsl.g:1726:2: ( ( (lv_jpc_0_0= 'Jouer plusieurs cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* ) ) ) otherlv_7= '}' )
            // InternalMyunodsl.g:1727:3: ( (lv_jpc_0_0= 'Jouer plusieurs cartes' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* ) ) ) otherlv_7= '}'
            {
            // InternalMyunodsl.g:1727:3: ( (lv_jpc_0_0= 'Jouer plusieurs cartes' ) )
            // InternalMyunodsl.g:1728:4: (lv_jpc_0_0= 'Jouer plusieurs cartes' )
            {
            // InternalMyunodsl.g:1728:4: (lv_jpc_0_0= 'Jouer plusieurs cartes' )
            // InternalMyunodsl.g:1729:5: lv_jpc_0_0= 'Jouer plusieurs cartes'
            {
            lv_jpc_0_0=(Token)match(input,53,FOLLOW_3); 

            					newLeafNode(lv_jpc_0_0, grammarAccess.getJouer_plusieurs_cartesAccess().getJpcJouerPlusieursCartesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJouer_plusieurs_cartesRule());
            					}
            					setWithLastConsumed(current, "jpc", lv_jpc_0_0, "Jouer plusieurs cartes");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getJouer_plusieurs_cartesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:1745:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* ) ) )
            // InternalMyunodsl.g:1746:4: ( ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* ) )
            {
            // InternalMyunodsl.g:1746:4: ( ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* ) )
            // InternalMyunodsl.g:1747:5: ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:1750:5: ( ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )* )
            // InternalMyunodsl.g:1751:6: ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )*
            {
            // InternalMyunodsl.g:1751:6: ( ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) ) )*
            loop16:
            do {
                int alt16=5;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 1) ) {
                    alt16=2;
                }
                else if ( LA16_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 2) ) {
                    alt16=3;
                }
                else if ( LA16_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 3) ) {
                    alt16=4;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyunodsl.g:1752:4: ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1752:4: ({...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) ) )
            	    // InternalMyunodsl.g:1753:5: {...}? => ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJouer_plusieurs_cartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:1753:119: ( ({...}? => ( (lv_s_3_0= ruleSuites ) ) ) )
            	    // InternalMyunodsl.g:1754:6: ({...}? => ( (lv_s_3_0= ruleSuites ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:1757:9: ({...}? => ( (lv_s_3_0= ruleSuites ) ) )
            	    // InternalMyunodsl.g:1757:10: {...}? => ( (lv_s_3_0= ruleSuites ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJouer_plusieurs_cartes", "true");
            	    }
            	    // InternalMyunodsl.g:1757:19: ( (lv_s_3_0= ruleSuites ) )
            	    // InternalMyunodsl.g:1757:20: (lv_s_3_0= ruleSuites )
            	    {
            	    // InternalMyunodsl.g:1757:20: (lv_s_3_0= ruleSuites )
            	    // InternalMyunodsl.g:1758:10: lv_s_3_0= ruleSuites
            	    {

            	    										newCompositeNode(grammarAccess.getJouer_plusieurs_cartesAccess().getSSuitesParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_32);
            	    lv_s_3_0=ruleSuites();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getJouer_plusieurs_cartesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"s",
            	    											lv_s_3_0,
            	    											"org.example.myunodsl.Myunodsl.Suites");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:1780:4: ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1780:4: ({...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) ) )
            	    // InternalMyunodsl.g:1781:5: {...}? => ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJouer_plusieurs_cartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:1781:119: ( ({...}? => ( (lv_c_4_0= 'couleur' ) ) ) )
            	    // InternalMyunodsl.g:1782:6: ({...}? => ( (lv_c_4_0= 'couleur' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:1785:9: ({...}? => ( (lv_c_4_0= 'couleur' ) ) )
            	    // InternalMyunodsl.g:1785:10: {...}? => ( (lv_c_4_0= 'couleur' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJouer_plusieurs_cartes", "true");
            	    }
            	    // InternalMyunodsl.g:1785:19: ( (lv_c_4_0= 'couleur' ) )
            	    // InternalMyunodsl.g:1785:20: (lv_c_4_0= 'couleur' )
            	    {
            	    // InternalMyunodsl.g:1785:20: (lv_c_4_0= 'couleur' )
            	    // InternalMyunodsl.g:1786:10: lv_c_4_0= 'couleur'
            	    {
            	    lv_c_4_0=(Token)match(input,54,FOLLOW_32); 

            	    										newLeafNode(lv_c_4_0, grammarAccess.getJouer_plusieurs_cartesAccess().getCCouleurKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getJouer_plusieurs_cartesRule());
            	    										}
            	    										setWithLastConsumed(current, "c", lv_c_4_0, "couleur");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyunodsl.g:1803:4: ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1803:4: ({...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) ) )
            	    // InternalMyunodsl.g:1804:5: {...}? => ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJouer_plusieurs_cartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyunodsl.g:1804:119: ( ({...}? => ( (lv_nb_5_0= 'nombre' ) ) ) )
            	    // InternalMyunodsl.g:1805:6: ({...}? => ( (lv_nb_5_0= 'nombre' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyunodsl.g:1808:9: ({...}? => ( (lv_nb_5_0= 'nombre' ) ) )
            	    // InternalMyunodsl.g:1808:10: {...}? => ( (lv_nb_5_0= 'nombre' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJouer_plusieurs_cartes", "true");
            	    }
            	    // InternalMyunodsl.g:1808:19: ( (lv_nb_5_0= 'nombre' ) )
            	    // InternalMyunodsl.g:1808:20: (lv_nb_5_0= 'nombre' )
            	    {
            	    // InternalMyunodsl.g:1808:20: (lv_nb_5_0= 'nombre' )
            	    // InternalMyunodsl.g:1809:10: lv_nb_5_0= 'nombre'
            	    {
            	    lv_nb_5_0=(Token)match(input,55,FOLLOW_32); 

            	    										newLeafNode(lv_nb_5_0, grammarAccess.getJouer_plusieurs_cartesAccess().getNbNombreKeyword_2_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getJouer_plusieurs_cartesRule());
            	    										}
            	    										setWithLastConsumed(current, "nb", lv_nb_5_0, "nombre");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyunodsl.g:1826:4: ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:1826:4: ({...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) ) )
            	    // InternalMyunodsl.g:1827:5: {...}? => ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJouer_plusieurs_cartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyunodsl.g:1827:119: ( ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) ) )
            	    // InternalMyunodsl.g:1828:6: ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyunodsl.g:1831:9: ({...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) ) )
            	    // InternalMyunodsl.g:1831:10: {...}? => ( (lv_cus_6_0= rulecartes_Uno_Speciales ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJouer_plusieurs_cartes", "true");
            	    }
            	    // InternalMyunodsl.g:1831:19: ( (lv_cus_6_0= rulecartes_Uno_Speciales ) )
            	    // InternalMyunodsl.g:1831:20: (lv_cus_6_0= rulecartes_Uno_Speciales )
            	    {
            	    // InternalMyunodsl.g:1831:20: (lv_cus_6_0= rulecartes_Uno_Speciales )
            	    // InternalMyunodsl.g:1832:10: lv_cus_6_0= rulecartes_Uno_Speciales
            	    {

            	    										newCompositeNode(grammarAccess.getJouer_plusieurs_cartesAccess().getCusCartes_Uno_SpecialesParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_32);
            	    lv_cus_6_0=rulecartes_Uno_Speciales();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getJouer_plusieurs_cartesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"cus",
            	    											lv_cus_6_0,
            	    											"org.example.myunodsl.Myunodsl.cartes_Uno_Speciales");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJouer_plusieurs_cartesAccess().getUnorderedGroup_2());
            				

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getJouer_plusieurs_cartesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJouer_plusieurs_cartes"


    // $ANTLR start "entryRuleSuites"
    // InternalMyunodsl.g:1869:1: entryRuleSuites returns [EObject current=null] : iv_ruleSuites= ruleSuites EOF ;
    public final EObject entryRuleSuites() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuites = null;


        try {
            // InternalMyunodsl.g:1869:47: (iv_ruleSuites= ruleSuites EOF )
            // InternalMyunodsl.g:1870:2: iv_ruleSuites= ruleSuites EOF
            {
             newCompositeNode(grammarAccess.getSuitesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuites=ruleSuites();

            state._fsp--;

             current =iv_ruleSuites; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuites"


    // $ANTLR start "ruleSuites"
    // InternalMyunodsl.g:1876:1: ruleSuites returns [EObject current=null] : ( ( (lv_suites_0_0= 'Suite' ) ) ( (lv_sr_1_0= 'suite royale' ) )? ) ;
    public final EObject ruleSuites() throws RecognitionException {
        EObject current = null;

        Token lv_suites_0_0=null;
        Token lv_sr_1_0=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:1882:2: ( ( ( (lv_suites_0_0= 'Suite' ) ) ( (lv_sr_1_0= 'suite royale' ) )? ) )
            // InternalMyunodsl.g:1883:2: ( ( (lv_suites_0_0= 'Suite' ) ) ( (lv_sr_1_0= 'suite royale' ) )? )
            {
            // InternalMyunodsl.g:1883:2: ( ( (lv_suites_0_0= 'Suite' ) ) ( (lv_sr_1_0= 'suite royale' ) )? )
            // InternalMyunodsl.g:1884:3: ( (lv_suites_0_0= 'Suite' ) ) ( (lv_sr_1_0= 'suite royale' ) )?
            {
            // InternalMyunodsl.g:1884:3: ( (lv_suites_0_0= 'Suite' ) )
            // InternalMyunodsl.g:1885:4: (lv_suites_0_0= 'Suite' )
            {
            // InternalMyunodsl.g:1885:4: (lv_suites_0_0= 'Suite' )
            // InternalMyunodsl.g:1886:5: lv_suites_0_0= 'Suite'
            {
            lv_suites_0_0=(Token)match(input,56,FOLLOW_33); 

            					newLeafNode(lv_suites_0_0, grammarAccess.getSuitesAccess().getSuitesSuiteKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuitesRule());
            					}
            					setWithLastConsumed(current, "suites", lv_suites_0_0, "Suite");
            				

            }


            }

            // InternalMyunodsl.g:1898:3: ( (lv_sr_1_0= 'suite royale' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==57) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyunodsl.g:1899:4: (lv_sr_1_0= 'suite royale' )
                    {
                    // InternalMyunodsl.g:1899:4: (lv_sr_1_0= 'suite royale' )
                    // InternalMyunodsl.g:1900:5: lv_sr_1_0= 'suite royale'
                    {
                    lv_sr_1_0=(Token)match(input,57,FOLLOW_2); 

                    					newLeafNode(lv_sr_1_0, grammarAccess.getSuitesAccess().getSrSuiteRoyaleKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSuitesRule());
                    					}
                    					setWithLastConsumed(current, "sr", lv_sr_1_0, "suite royale");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuites"


    // $ANTLR start "entryRulecartes_Uno_Speciales"
    // InternalMyunodsl.g:1916:1: entryRulecartes_Uno_Speciales returns [EObject current=null] : iv_rulecartes_Uno_Speciales= rulecartes_Uno_Speciales EOF ;
    public final EObject entryRulecartes_Uno_Speciales() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecartes_Uno_Speciales = null;


        try {
            // InternalMyunodsl.g:1916:61: (iv_rulecartes_Uno_Speciales= rulecartes_Uno_Speciales EOF )
            // InternalMyunodsl.g:1917:2: iv_rulecartes_Uno_Speciales= rulecartes_Uno_Speciales EOF
            {
             newCompositeNode(grammarAccess.getCartes_Uno_SpecialesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecartes_Uno_Speciales=rulecartes_Uno_Speciales();

            state._fsp--;

             current =iv_rulecartes_Uno_Speciales; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecartes_Uno_Speciales"


    // $ANTLR start "rulecartes_Uno_Speciales"
    // InternalMyunodsl.g:1923:1: rulecartes_Uno_Speciales returns [EObject current=null] : ( ( (lv_cuss_0_0= 'cartes Uno speciales' ) ) otherlv_1= '{' ( (lv_p_2_0= rulePlus ) ) otherlv_3= '}' ) ;
    public final EObject rulecartes_Uno_Speciales() throws RecognitionException {
        EObject current = null;

        Token lv_cuss_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_p_2_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:1929:2: ( ( ( (lv_cuss_0_0= 'cartes Uno speciales' ) ) otherlv_1= '{' ( (lv_p_2_0= rulePlus ) ) otherlv_3= '}' ) )
            // InternalMyunodsl.g:1930:2: ( ( (lv_cuss_0_0= 'cartes Uno speciales' ) ) otherlv_1= '{' ( (lv_p_2_0= rulePlus ) ) otherlv_3= '}' )
            {
            // InternalMyunodsl.g:1930:2: ( ( (lv_cuss_0_0= 'cartes Uno speciales' ) ) otherlv_1= '{' ( (lv_p_2_0= rulePlus ) ) otherlv_3= '}' )
            // InternalMyunodsl.g:1931:3: ( (lv_cuss_0_0= 'cartes Uno speciales' ) ) otherlv_1= '{' ( (lv_p_2_0= rulePlus ) ) otherlv_3= '}'
            {
            // InternalMyunodsl.g:1931:3: ( (lv_cuss_0_0= 'cartes Uno speciales' ) )
            // InternalMyunodsl.g:1932:4: (lv_cuss_0_0= 'cartes Uno speciales' )
            {
            // InternalMyunodsl.g:1932:4: (lv_cuss_0_0= 'cartes Uno speciales' )
            // InternalMyunodsl.g:1933:5: lv_cuss_0_0= 'cartes Uno speciales'
            {
            lv_cuss_0_0=(Token)match(input,58,FOLLOW_3); 

            					newLeafNode(lv_cuss_0_0, grammarAccess.getCartes_Uno_SpecialesAccess().getCussCartesUnoSpecialesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCartes_Uno_SpecialesRule());
            					}
            					setWithLastConsumed(current, "cuss", lv_cuss_0_0, "cartes Uno speciales");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getCartes_Uno_SpecialesAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:1949:3: ( (lv_p_2_0= rulePlus ) )
            // InternalMyunodsl.g:1950:4: (lv_p_2_0= rulePlus )
            {
            // InternalMyunodsl.g:1950:4: (lv_p_2_0= rulePlus )
            // InternalMyunodsl.g:1951:5: lv_p_2_0= rulePlus
            {

            					newCompositeNode(grammarAccess.getCartes_Uno_SpecialesAccess().getPPlusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_p_2_0=rulePlus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCartes_Uno_SpecialesRule());
            					}
            					set(
            						current,
            						"p",
            						lv_p_2_0,
            						"org.example.myunodsl.Myunodsl.Plus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCartes_Uno_SpecialesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecartes_Uno_Speciales"


    // $ANTLR start "entryRulePlus"
    // InternalMyunodsl.g:1976:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalMyunodsl.g:1976:45: (iv_rulePlus= rulePlus EOF )
            // InternalMyunodsl.g:1977:2: iv_rulePlus= rulePlus EOF
            {
             newCompositeNode(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlus=rulePlus();

            state._fsp--;

             current =iv_rulePlus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalMyunodsl.g:1983:1: rulePlus returns [EObject current=null] : ( ( (lv_plus_0_0= 'Plus' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_5= '}' ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token lv_plus_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_pd_3_0 = null;

        EObject lv_k_4_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:1989:2: ( ( ( (lv_plus_0_0= 'Plus' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_5= '}' ) )
            // InternalMyunodsl.g:1990:2: ( ( (lv_plus_0_0= 'Plus' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_5= '}' )
            {
            // InternalMyunodsl.g:1990:2: ( ( (lv_plus_0_0= 'Plus' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_5= '}' )
            // InternalMyunodsl.g:1991:3: ( (lv_plus_0_0= 'Plus' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) ) otherlv_5= '}'
            {
            // InternalMyunodsl.g:1991:3: ( (lv_plus_0_0= 'Plus' ) )
            // InternalMyunodsl.g:1992:4: (lv_plus_0_0= 'Plus' )
            {
            // InternalMyunodsl.g:1992:4: (lv_plus_0_0= 'Plus' )
            // InternalMyunodsl.g:1993:5: lv_plus_0_0= 'Plus'
            {
            lv_plus_0_0=(Token)match(input,59,FOLLOW_3); 

            					newLeafNode(lv_plus_0_0, grammarAccess.getPlusAccess().getPlusPlusKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlusRule());
            					}
            					setWithLastConsumed(current, "plus", lv_plus_0_0, "Plus");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getPlusAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:2009:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* ) ) )
            // InternalMyunodsl.g:2010:4: ( ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* ) )
            {
            // InternalMyunodsl.g:2010:4: ( ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* ) )
            // InternalMyunodsl.g:2011:5: ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPlusAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:2014:5: ( ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )* )
            // InternalMyunodsl.g:2015:6: ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )*
            {
            // InternalMyunodsl.g:2015:6: ( ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( LA18_0 >= 85 && LA18_0 <= 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlusAccess().getUnorderedGroup_2(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 >= 83 && LA18_0 <= 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlusAccess().getUnorderedGroup_2(), 1) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyunodsl.g:2016:4: ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2016:4: ({...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) ) )
            	    // InternalMyunodsl.g:2017:5: {...}? => ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlusAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePlus", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlusAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:2017:101: ( ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) ) )
            	    // InternalMyunodsl.g:2018:6: ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlusAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:2021:9: ({...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) ) )
            	    // InternalMyunodsl.g:2021:10: {...}? => ( (lv_pd_3_0= rulePLUS_DEUX ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlus", "true");
            	    }
            	    // InternalMyunodsl.g:2021:19: ( (lv_pd_3_0= rulePLUS_DEUX ) )
            	    // InternalMyunodsl.g:2021:20: (lv_pd_3_0= rulePLUS_DEUX )
            	    {
            	    // InternalMyunodsl.g:2021:20: (lv_pd_3_0= rulePLUS_DEUX )
            	    // InternalMyunodsl.g:2022:10: lv_pd_3_0= rulePLUS_DEUX
            	    {

            	    										newCompositeNode(grammarAccess.getPlusAccess().getPdPLUS_DEUXParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_35);
            	    lv_pd_3_0=rulePLUS_DEUX();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPlusRule());
            	    										}
            	    										set(
            	    											current,
            	    											"pd",
            	    											lv_pd_3_0,
            	    											"org.example.myunodsl.Myunodsl.PLUS_DEUX");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlusAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:2044:4: ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2044:4: ({...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) ) )
            	    // InternalMyunodsl.g:2045:5: {...}? => ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlusAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePlus", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlusAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:2045:101: ( ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) ) )
            	    // InternalMyunodsl.g:2046:6: ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlusAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:2049:9: ({...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) ) )
            	    // InternalMyunodsl.g:2049:10: {...}? => ( (lv_k_4_0= rulePLUS_QUATRE ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlus", "true");
            	    }
            	    // InternalMyunodsl.g:2049:19: ( (lv_k_4_0= rulePLUS_QUATRE ) )
            	    // InternalMyunodsl.g:2049:20: (lv_k_4_0= rulePLUS_QUATRE )
            	    {
            	    // InternalMyunodsl.g:2049:20: (lv_k_4_0= rulePLUS_QUATRE )
            	    // InternalMyunodsl.g:2050:10: lv_k_4_0= rulePLUS_QUATRE
            	    {

            	    										newCompositeNode(grammarAccess.getPlusAccess().getKPLUS_QUATREParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_35);
            	    lv_k_4_0=rulePLUS_QUATRE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPlusRule());
            	    										}
            	    										set(
            	    											current,
            	    											"k",
            	    											lv_k_4_0,
            	    											"org.example.myunodsl.Myunodsl.PLUS_QUATRE");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlusAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPlusAccess().getUnorderedGroup_2());
            				

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlusAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleCouper_le_jeu"
    // InternalMyunodsl.g:2087:1: entryRuleCouper_le_jeu returns [EObject current=null] : iv_ruleCouper_le_jeu= ruleCouper_le_jeu EOF ;
    public final EObject entryRuleCouper_le_jeu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCouper_le_jeu = null;


        try {
            // InternalMyunodsl.g:2087:54: (iv_ruleCouper_le_jeu= ruleCouper_le_jeu EOF )
            // InternalMyunodsl.g:2088:2: iv_ruleCouper_le_jeu= ruleCouper_le_jeu EOF
            {
             newCompositeNode(grammarAccess.getCouper_le_jeuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCouper_le_jeu=ruleCouper_le_jeu();

            state._fsp--;

             current =iv_ruleCouper_le_jeu; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCouper_le_jeu"


    // $ANTLR start "ruleCouper_le_jeu"
    // InternalMyunodsl.g:2094:1: ruleCouper_le_jeu returns [EObject current=null] : ( ( (lv_clj_0_0= 'couper le jeu' ) ) ( (lv_mn_1_0= ruleMeme_nombre ) )? ) ;
    public final EObject ruleCouper_le_jeu() throws RecognitionException {
        EObject current = null;

        Token lv_clj_0_0=null;
        EObject lv_mn_1_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:2100:2: ( ( ( (lv_clj_0_0= 'couper le jeu' ) ) ( (lv_mn_1_0= ruleMeme_nombre ) )? ) )
            // InternalMyunodsl.g:2101:2: ( ( (lv_clj_0_0= 'couper le jeu' ) ) ( (lv_mn_1_0= ruleMeme_nombre ) )? )
            {
            // InternalMyunodsl.g:2101:2: ( ( (lv_clj_0_0= 'couper le jeu' ) ) ( (lv_mn_1_0= ruleMeme_nombre ) )? )
            // InternalMyunodsl.g:2102:3: ( (lv_clj_0_0= 'couper le jeu' ) ) ( (lv_mn_1_0= ruleMeme_nombre ) )?
            {
            // InternalMyunodsl.g:2102:3: ( (lv_clj_0_0= 'couper le jeu' ) )
            // InternalMyunodsl.g:2103:4: (lv_clj_0_0= 'couper le jeu' )
            {
            // InternalMyunodsl.g:2103:4: (lv_clj_0_0= 'couper le jeu' )
            // InternalMyunodsl.g:2104:5: lv_clj_0_0= 'couper le jeu'
            {
            lv_clj_0_0=(Token)match(input,60,FOLLOW_36); 

            					newLeafNode(lv_clj_0_0, grammarAccess.getCouper_le_jeuAccess().getCljCouperLeJeuKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCouper_le_jeuRule());
            					}
            					setWithLastConsumed(current, "clj", lv_clj_0_0, "couper le jeu");
            				

            }


            }

            // InternalMyunodsl.g:2116:3: ( (lv_mn_1_0= ruleMeme_nombre ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==61) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyunodsl.g:2117:4: (lv_mn_1_0= ruleMeme_nombre )
                    {
                    // InternalMyunodsl.g:2117:4: (lv_mn_1_0= ruleMeme_nombre )
                    // InternalMyunodsl.g:2118:5: lv_mn_1_0= ruleMeme_nombre
                    {

                    					newCompositeNode(grammarAccess.getCouper_le_jeuAccess().getMnMeme_nombreParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_mn_1_0=ruleMeme_nombre();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCouper_le_jeuRule());
                    					}
                    					set(
                    						current,
                    						"mn",
                    						lv_mn_1_0,
                    						"org.example.myunodsl.Myunodsl.Meme_nombre");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCouper_le_jeu"


    // $ANTLR start "entryRuleMeme_nombre"
    // InternalMyunodsl.g:2139:1: entryRuleMeme_nombre returns [EObject current=null] : iv_ruleMeme_nombre= ruleMeme_nombre EOF ;
    public final EObject entryRuleMeme_nombre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeme_nombre = null;


        try {
            // InternalMyunodsl.g:2139:52: (iv_ruleMeme_nombre= ruleMeme_nombre EOF )
            // InternalMyunodsl.g:2140:2: iv_ruleMeme_nombre= ruleMeme_nombre EOF
            {
             newCompositeNode(grammarAccess.getMeme_nombreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeme_nombre=ruleMeme_nombre();

            state._fsp--;

             current =iv_ruleMeme_nombre; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeme_nombre"


    // $ANTLR start "ruleMeme_nombre"
    // InternalMyunodsl.g:2146:1: ruleMeme_nombre returns [EObject current=null] : ( ( (lv_mn_0_0= 'meme nombre' ) ) ( (lv_mc_1_0= 'meme carte' ) )? ) ;
    public final EObject ruleMeme_nombre() throws RecognitionException {
        EObject current = null;

        Token lv_mn_0_0=null;
        Token lv_mc_1_0=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:2152:2: ( ( ( (lv_mn_0_0= 'meme nombre' ) ) ( (lv_mc_1_0= 'meme carte' ) )? ) )
            // InternalMyunodsl.g:2153:2: ( ( (lv_mn_0_0= 'meme nombre' ) ) ( (lv_mc_1_0= 'meme carte' ) )? )
            {
            // InternalMyunodsl.g:2153:2: ( ( (lv_mn_0_0= 'meme nombre' ) ) ( (lv_mc_1_0= 'meme carte' ) )? )
            // InternalMyunodsl.g:2154:3: ( (lv_mn_0_0= 'meme nombre' ) ) ( (lv_mc_1_0= 'meme carte' ) )?
            {
            // InternalMyunodsl.g:2154:3: ( (lv_mn_0_0= 'meme nombre' ) )
            // InternalMyunodsl.g:2155:4: (lv_mn_0_0= 'meme nombre' )
            {
            // InternalMyunodsl.g:2155:4: (lv_mn_0_0= 'meme nombre' )
            // InternalMyunodsl.g:2156:5: lv_mn_0_0= 'meme nombre'
            {
            lv_mn_0_0=(Token)match(input,61,FOLLOW_37); 

            					newLeafNode(lv_mn_0_0, grammarAccess.getMeme_nombreAccess().getMnMemeNombreKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeme_nombreRule());
            					}
            					setWithLastConsumed(current, "mn", lv_mn_0_0, "meme nombre");
            				

            }


            }

            // InternalMyunodsl.g:2168:3: ( (lv_mc_1_0= 'meme carte' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyunodsl.g:2169:4: (lv_mc_1_0= 'meme carte' )
                    {
                    // InternalMyunodsl.g:2169:4: (lv_mc_1_0= 'meme carte' )
                    // InternalMyunodsl.g:2170:5: lv_mc_1_0= 'meme carte'
                    {
                    lv_mc_1_0=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_mc_1_0, grammarAccess.getMeme_nombreAccess().getMcMemeCarteKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeme_nombreRule());
                    					}
                    					setWithLastConsumed(current, "mc", lv_mc_1_0, "meme carte");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeme_nombre"


    // $ANTLR start "entryRuleChanger_de_mains"
    // InternalMyunodsl.g:2186:1: entryRuleChanger_de_mains returns [EObject current=null] : iv_ruleChanger_de_mains= ruleChanger_de_mains EOF ;
    public final EObject entryRuleChanger_de_mains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChanger_de_mains = null;


        try {
            // InternalMyunodsl.g:2186:57: (iv_ruleChanger_de_mains= ruleChanger_de_mains EOF )
            // InternalMyunodsl.g:2187:2: iv_ruleChanger_de_mains= ruleChanger_de_mains EOF
            {
             newCompositeNode(grammarAccess.getChanger_de_mainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChanger_de_mains=ruleChanger_de_mains();

            state._fsp--;

             current =iv_ruleChanger_de_mains; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChanger_de_mains"


    // $ANTLR start "ruleChanger_de_mains"
    // InternalMyunodsl.g:2193:1: ruleChanger_de_mains returns [EObject current=null] : ( ( (lv_cdm_0_0= 'Changer de mains' ) ) otherlv_1= '{' ( (lv_sev_2_0= ruleSeven_0 ) ) otherlv_3= '}' ) ;
    public final EObject ruleChanger_de_mains() throws RecognitionException {
        EObject current = null;

        Token lv_cdm_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sev_2_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:2199:2: ( ( ( (lv_cdm_0_0= 'Changer de mains' ) ) otherlv_1= '{' ( (lv_sev_2_0= ruleSeven_0 ) ) otherlv_3= '}' ) )
            // InternalMyunodsl.g:2200:2: ( ( (lv_cdm_0_0= 'Changer de mains' ) ) otherlv_1= '{' ( (lv_sev_2_0= ruleSeven_0 ) ) otherlv_3= '}' )
            {
            // InternalMyunodsl.g:2200:2: ( ( (lv_cdm_0_0= 'Changer de mains' ) ) otherlv_1= '{' ( (lv_sev_2_0= ruleSeven_0 ) ) otherlv_3= '}' )
            // InternalMyunodsl.g:2201:3: ( (lv_cdm_0_0= 'Changer de mains' ) ) otherlv_1= '{' ( (lv_sev_2_0= ruleSeven_0 ) ) otherlv_3= '}'
            {
            // InternalMyunodsl.g:2201:3: ( (lv_cdm_0_0= 'Changer de mains' ) )
            // InternalMyunodsl.g:2202:4: (lv_cdm_0_0= 'Changer de mains' )
            {
            // InternalMyunodsl.g:2202:4: (lv_cdm_0_0= 'Changer de mains' )
            // InternalMyunodsl.g:2203:5: lv_cdm_0_0= 'Changer de mains'
            {
            lv_cdm_0_0=(Token)match(input,63,FOLLOW_3); 

            					newLeafNode(lv_cdm_0_0, grammarAccess.getChanger_de_mainsAccess().getCdmChangerDeMainsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChanger_de_mainsRule());
            					}
            					setWithLastConsumed(current, "cdm", lv_cdm_0_0, "Changer de mains");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getChanger_de_mainsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:2219:3: ( (lv_sev_2_0= ruleSeven_0 ) )
            // InternalMyunodsl.g:2220:4: (lv_sev_2_0= ruleSeven_0 )
            {
            // InternalMyunodsl.g:2220:4: (lv_sev_2_0= ruleSeven_0 )
            // InternalMyunodsl.g:2221:5: lv_sev_2_0= ruleSeven_0
            {

            					newCompositeNode(grammarAccess.getChanger_de_mainsAccess().getSevSeven_0ParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_sev_2_0=ruleSeven_0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChanger_de_mainsRule());
            					}
            					set(
            						current,
            						"sev",
            						lv_sev_2_0,
            						"org.example.myunodsl.Myunodsl.Seven_0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getChanger_de_mainsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChanger_de_mains"


    // $ANTLR start "entryRuleSeven_0"
    // InternalMyunodsl.g:2246:1: entryRuleSeven_0 returns [EObject current=null] : iv_ruleSeven_0= ruleSeven_0 EOF ;
    public final EObject entryRuleSeven_0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeven_0 = null;


        try {
            // InternalMyunodsl.g:2246:48: (iv_ruleSeven_0= ruleSeven_0 EOF )
            // InternalMyunodsl.g:2247:2: iv_ruleSeven_0= ruleSeven_0 EOF
            {
             newCompositeNode(grammarAccess.getSeven_0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeven_0=ruleSeven_0();

            state._fsp--;

             current =iv_ruleSeven_0; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeven_0"


    // $ANTLR start "ruleSeven_0"
    // InternalMyunodsl.g:2253:1: ruleSeven_0 returns [EObject current=null] : ( ( (lv_se_0_0= 'Seven_0' ) ) otherlv_1= ':' ( (lv_sept_2_0= 'Sept' ) )? ( (lv_zero_3_0= 'Zero' ) )? ) ;
    public final EObject ruleSeven_0() throws RecognitionException {
        EObject current = null;

        Token lv_se_0_0=null;
        Token otherlv_1=null;
        Token lv_sept_2_0=null;
        Token lv_zero_3_0=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:2259:2: ( ( ( (lv_se_0_0= 'Seven_0' ) ) otherlv_1= ':' ( (lv_sept_2_0= 'Sept' ) )? ( (lv_zero_3_0= 'Zero' ) )? ) )
            // InternalMyunodsl.g:2260:2: ( ( (lv_se_0_0= 'Seven_0' ) ) otherlv_1= ':' ( (lv_sept_2_0= 'Sept' ) )? ( (lv_zero_3_0= 'Zero' ) )? )
            {
            // InternalMyunodsl.g:2260:2: ( ( (lv_se_0_0= 'Seven_0' ) ) otherlv_1= ':' ( (lv_sept_2_0= 'Sept' ) )? ( (lv_zero_3_0= 'Zero' ) )? )
            // InternalMyunodsl.g:2261:3: ( (lv_se_0_0= 'Seven_0' ) ) otherlv_1= ':' ( (lv_sept_2_0= 'Sept' ) )? ( (lv_zero_3_0= 'Zero' ) )?
            {
            // InternalMyunodsl.g:2261:3: ( (lv_se_0_0= 'Seven_0' ) )
            // InternalMyunodsl.g:2262:4: (lv_se_0_0= 'Seven_0' )
            {
            // InternalMyunodsl.g:2262:4: (lv_se_0_0= 'Seven_0' )
            // InternalMyunodsl.g:2263:5: lv_se_0_0= 'Seven_0'
            {
            lv_se_0_0=(Token)match(input,64,FOLLOW_12); 

            					newLeafNode(lv_se_0_0, grammarAccess.getSeven_0Access().getSeSeven_0Keyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSeven_0Rule());
            					}
            					setWithLastConsumed(current, "se", lv_se_0_0, "Seven_0");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getSeven_0Access().getColonKeyword_1());
            		
            // InternalMyunodsl.g:2279:3: ( (lv_sept_2_0= 'Sept' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==65) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyunodsl.g:2280:4: (lv_sept_2_0= 'Sept' )
                    {
                    // InternalMyunodsl.g:2280:4: (lv_sept_2_0= 'Sept' )
                    // InternalMyunodsl.g:2281:5: lv_sept_2_0= 'Sept'
                    {
                    lv_sept_2_0=(Token)match(input,65,FOLLOW_40); 

                    					newLeafNode(lv_sept_2_0, grammarAccess.getSeven_0Access().getSeptSeptKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeven_0Rule());
                    					}
                    					setWithLastConsumed(current, "sept", lv_sept_2_0, "Sept");
                    				

                    }


                    }
                    break;

            }

            // InternalMyunodsl.g:2293:3: ( (lv_zero_3_0= 'Zero' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==66) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyunodsl.g:2294:4: (lv_zero_3_0= 'Zero' )
                    {
                    // InternalMyunodsl.g:2294:4: (lv_zero_3_0= 'Zero' )
                    // InternalMyunodsl.g:2295:5: lv_zero_3_0= 'Zero'
                    {
                    lv_zero_3_0=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(lv_zero_3_0, grammarAccess.getSeven_0Access().getZeroZeroKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSeven_0Rule());
                    					}
                    					setWithLastConsumed(current, "zero", lv_zero_3_0, "Zero");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeven_0"


    // $ANTLR start "entryRulePlus4"
    // InternalMyunodsl.g:2311:1: entryRulePlus4 returns [EObject current=null] : iv_rulePlus4= rulePlus4 EOF ;
    public final EObject entryRulePlus4() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus4 = null;


        try {
            // InternalMyunodsl.g:2311:46: (iv_rulePlus4= rulePlus4 EOF )
            // InternalMyunodsl.g:2312:2: iv_rulePlus4= rulePlus4 EOF
            {
             newCompositeNode(grammarAccess.getPlus4Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlus4=rulePlus4();

            state._fsp--;

             current =iv_rulePlus4; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlus4"


    // $ANTLR start "rulePlus4"
    // InternalMyunodsl.g:2318:1: rulePlus4 returns [EObject current=null] : ( ( (lv_pqq_0_0= rulePLUS_QUATRE ) ) otherlv_1= '{' ( ( (lv_pq_2_0= rulePLUS_QUATRE ) ) ( (lv_ss_3_0= 'seulement si rien d autre' ) ) )? ( ( (lv_it_4_0= 'Interdit de finir avec un' ) ) ( (lv_p_5_0= rulePLUS_QUATRE ) ) )? otherlv_6= '}' ) ;
    public final EObject rulePlus4() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_ss_3_0=null;
        Token lv_it_4_0=null;
        Token otherlv_6=null;
        EObject lv_pqq_0_0 = null;

        EObject lv_pq_2_0 = null;

        EObject lv_p_5_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:2324:2: ( ( ( (lv_pqq_0_0= rulePLUS_QUATRE ) ) otherlv_1= '{' ( ( (lv_pq_2_0= rulePLUS_QUATRE ) ) ( (lv_ss_3_0= 'seulement si rien d autre' ) ) )? ( ( (lv_it_4_0= 'Interdit de finir avec un' ) ) ( (lv_p_5_0= rulePLUS_QUATRE ) ) )? otherlv_6= '}' ) )
            // InternalMyunodsl.g:2325:2: ( ( (lv_pqq_0_0= rulePLUS_QUATRE ) ) otherlv_1= '{' ( ( (lv_pq_2_0= rulePLUS_QUATRE ) ) ( (lv_ss_3_0= 'seulement si rien d autre' ) ) )? ( ( (lv_it_4_0= 'Interdit de finir avec un' ) ) ( (lv_p_5_0= rulePLUS_QUATRE ) ) )? otherlv_6= '}' )
            {
            // InternalMyunodsl.g:2325:2: ( ( (lv_pqq_0_0= rulePLUS_QUATRE ) ) otherlv_1= '{' ( ( (lv_pq_2_0= rulePLUS_QUATRE ) ) ( (lv_ss_3_0= 'seulement si rien d autre' ) ) )? ( ( (lv_it_4_0= 'Interdit de finir avec un' ) ) ( (lv_p_5_0= rulePLUS_QUATRE ) ) )? otherlv_6= '}' )
            // InternalMyunodsl.g:2326:3: ( (lv_pqq_0_0= rulePLUS_QUATRE ) ) otherlv_1= '{' ( ( (lv_pq_2_0= rulePLUS_QUATRE ) ) ( (lv_ss_3_0= 'seulement si rien d autre' ) ) )? ( ( (lv_it_4_0= 'Interdit de finir avec un' ) ) ( (lv_p_5_0= rulePLUS_QUATRE ) ) )? otherlv_6= '}'
            {
            // InternalMyunodsl.g:2326:3: ( (lv_pqq_0_0= rulePLUS_QUATRE ) )
            // InternalMyunodsl.g:2327:4: (lv_pqq_0_0= rulePLUS_QUATRE )
            {
            // InternalMyunodsl.g:2327:4: (lv_pqq_0_0= rulePLUS_QUATRE )
            // InternalMyunodsl.g:2328:5: lv_pqq_0_0= rulePLUS_QUATRE
            {

            					newCompositeNode(grammarAccess.getPlus4Access().getPqqPLUS_QUATREParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_pqq_0_0=rulePLUS_QUATRE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlus4Rule());
            					}
            					set(
            						current,
            						"pqq",
            						lv_pqq_0_0,
            						"org.example.myunodsl.Myunodsl.PLUS_QUATRE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getPlus4Access().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:2349:3: ( ( (lv_pq_2_0= rulePLUS_QUATRE ) ) ( (lv_ss_3_0= 'seulement si rien d autre' ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=83 && LA23_0<=84)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyunodsl.g:2350:4: ( (lv_pq_2_0= rulePLUS_QUATRE ) ) ( (lv_ss_3_0= 'seulement si rien d autre' ) )
                    {
                    // InternalMyunodsl.g:2350:4: ( (lv_pq_2_0= rulePLUS_QUATRE ) )
                    // InternalMyunodsl.g:2351:5: (lv_pq_2_0= rulePLUS_QUATRE )
                    {
                    // InternalMyunodsl.g:2351:5: (lv_pq_2_0= rulePLUS_QUATRE )
                    // InternalMyunodsl.g:2352:6: lv_pq_2_0= rulePLUS_QUATRE
                    {

                    						newCompositeNode(grammarAccess.getPlus4Access().getPqPLUS_QUATREParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_pq_2_0=rulePLUS_QUATRE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlus4Rule());
                    						}
                    						set(
                    							current,
                    							"pq",
                    							lv_pq_2_0,
                    							"org.example.myunodsl.Myunodsl.PLUS_QUATRE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyunodsl.g:2369:4: ( (lv_ss_3_0= 'seulement si rien d autre' ) )
                    // InternalMyunodsl.g:2370:5: (lv_ss_3_0= 'seulement si rien d autre' )
                    {
                    // InternalMyunodsl.g:2370:5: (lv_ss_3_0= 'seulement si rien d autre' )
                    // InternalMyunodsl.g:2371:6: lv_ss_3_0= 'seulement si rien d autre'
                    {
                    lv_ss_3_0=(Token)match(input,67,FOLLOW_43); 

                    						newLeafNode(lv_ss_3_0, grammarAccess.getPlus4Access().getSsSeulementSiRienDAutreKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlus4Rule());
                    						}
                    						setWithLastConsumed(current, "ss", lv_ss_3_0, "seulement si rien d autre");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyunodsl.g:2384:3: ( ( (lv_it_4_0= 'Interdit de finir avec un' ) ) ( (lv_p_5_0= rulePLUS_QUATRE ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==68) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyunodsl.g:2385:4: ( (lv_it_4_0= 'Interdit de finir avec un' ) ) ( (lv_p_5_0= rulePLUS_QUATRE ) )
                    {
                    // InternalMyunodsl.g:2385:4: ( (lv_it_4_0= 'Interdit de finir avec un' ) )
                    // InternalMyunodsl.g:2386:5: (lv_it_4_0= 'Interdit de finir avec un' )
                    {
                    // InternalMyunodsl.g:2386:5: (lv_it_4_0= 'Interdit de finir avec un' )
                    // InternalMyunodsl.g:2387:6: lv_it_4_0= 'Interdit de finir avec un'
                    {
                    lv_it_4_0=(Token)match(input,68,FOLLOW_44); 

                    						newLeafNode(lv_it_4_0, grammarAccess.getPlus4Access().getItInterditDeFinirAvecUnKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPlus4Rule());
                    						}
                    						setWithLastConsumed(current, "it", lv_it_4_0, "Interdit de finir avec un");
                    					

                    }


                    }

                    // InternalMyunodsl.g:2399:4: ( (lv_p_5_0= rulePLUS_QUATRE ) )
                    // InternalMyunodsl.g:2400:5: (lv_p_5_0= rulePLUS_QUATRE )
                    {
                    // InternalMyunodsl.g:2400:5: (lv_p_5_0= rulePLUS_QUATRE )
                    // InternalMyunodsl.g:2401:6: lv_p_5_0= rulePLUS_QUATRE
                    {

                    						newCompositeNode(grammarAccess.getPlus4Access().getPPLUS_QUATREParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_p_5_0=rulePLUS_QUATRE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPlus4Rule());
                    						}
                    						set(
                    							current,
                    							"p",
                    							lv_p_5_0,
                    							"org.example.myunodsl.Myunodsl.PLUS_QUATRE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPlus4Access().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlus4"


    // $ANTLR start "entryRulePenalite"
    // InternalMyunodsl.g:2427:1: entryRulePenalite returns [EObject current=null] : iv_rulePenalite= rulePenalite EOF ;
    public final EObject entryRulePenalite() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePenalite = null;


        try {
            // InternalMyunodsl.g:2427:49: (iv_rulePenalite= rulePenalite EOF )
            // InternalMyunodsl.g:2428:2: iv_rulePenalite= rulePenalite EOF
            {
             newCompositeNode(grammarAccess.getPenaliteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePenalite=rulePenalite();

            state._fsp--;

             current =iv_rulePenalite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePenalite"


    // $ANTLR start "rulePenalite"
    // InternalMyunodsl.g:2434:1: rulePenalite returns [EObject current=null] : ( ( (lv_penalites_0_0= 'Penalites' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) ;
    public final EObject rulePenalite() throws RecognitionException {
        EObject current = null;

        Token lv_penalites_0_0=null;
        Token otherlv_1=null;
        Token lv_ci_3_0=null;
        Token lv_tpsl_5_0=null;
        Token lv_ltps_6_0=null;
        Token lv_penalite_7_0=null;
        Token otherlv_8=null;
        EObject lv_contestation_4_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:2440:2: ( ( ( (lv_penalites_0_0= 'Penalites' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* ) ) ) otherlv_8= '}' ) )
            // InternalMyunodsl.g:2441:2: ( ( (lv_penalites_0_0= 'Penalites' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            {
            // InternalMyunodsl.g:2441:2: ( ( (lv_penalites_0_0= 'Penalites' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* ) ) ) otherlv_8= '}' )
            // InternalMyunodsl.g:2442:3: ( (lv_penalites_0_0= 'Penalites' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* ) ) ) otherlv_8= '}'
            {
            // InternalMyunodsl.g:2442:3: ( (lv_penalites_0_0= 'Penalites' ) )
            // InternalMyunodsl.g:2443:4: (lv_penalites_0_0= 'Penalites' )
            {
            // InternalMyunodsl.g:2443:4: (lv_penalites_0_0= 'Penalites' )
            // InternalMyunodsl.g:2444:5: lv_penalites_0_0= 'Penalites'
            {
            lv_penalites_0_0=(Token)match(input,69,FOLLOW_3); 

            					newLeafNode(lv_penalites_0_0, grammarAccess.getPenaliteAccess().getPenalitesPenalitesKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPenaliteRule());
            					}
            					setWithLastConsumed(current, "penalites", lv_penalites_0_0, "Penalites");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getPenaliteAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:2460:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* ) ) )
            // InternalMyunodsl.g:2461:4: ( ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* ) )
            {
            // InternalMyunodsl.g:2461:4: ( ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* ) )
            // InternalMyunodsl.g:2462:5: ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPenaliteAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:2465:5: ( ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )* )
            // InternalMyunodsl.g:2466:6: ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )*
            {
            // InternalMyunodsl.g:2466:6: ( ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) ) )*
            loop25:
            do {
                int alt25=6;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 3) ) {
                    alt25=4;
                }
                else if ( LA25_0 == RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 4) ) {
                    alt25=5;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyunodsl.g:2467:4: ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2467:4: ({...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) ) )
            	    // InternalMyunodsl.g:2468:5: {...}? => ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:2468:105: ( ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) ) )
            	    // InternalMyunodsl.g:2469:6: ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:2472:9: ({...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) ) )
            	    // InternalMyunodsl.g:2472:10: {...}? => ( (lv_ci_3_0= 'commentaire intempestif' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "true");
            	    }
            	    // InternalMyunodsl.g:2472:19: ( (lv_ci_3_0= 'commentaire intempestif' ) )
            	    // InternalMyunodsl.g:2472:20: (lv_ci_3_0= 'commentaire intempestif' )
            	    {
            	    // InternalMyunodsl.g:2472:20: (lv_ci_3_0= 'commentaire intempestif' )
            	    // InternalMyunodsl.g:2473:10: lv_ci_3_0= 'commentaire intempestif'
            	    {
            	    lv_ci_3_0=(Token)match(input,70,FOLLOW_45); 

            	    										newLeafNode(lv_ci_3_0, grammarAccess.getPenaliteAccess().getCiCommentaireIntempestifKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPenaliteRule());
            	    										}
            	    										setWithLastConsumed(current, "ci", lv_ci_3_0, "commentaire intempestif");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPenaliteAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:2490:4: ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2490:4: ({...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) ) )
            	    // InternalMyunodsl.g:2491:5: {...}? => ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:2491:105: ( ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) ) )
            	    // InternalMyunodsl.g:2492:6: ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:2495:9: ({...}? => ( (lv_contestation_4_0= ruleContestations ) ) )
            	    // InternalMyunodsl.g:2495:10: {...}? => ( (lv_contestation_4_0= ruleContestations ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "true");
            	    }
            	    // InternalMyunodsl.g:2495:19: ( (lv_contestation_4_0= ruleContestations ) )
            	    // InternalMyunodsl.g:2495:20: (lv_contestation_4_0= ruleContestations )
            	    {
            	    // InternalMyunodsl.g:2495:20: (lv_contestation_4_0= ruleContestations )
            	    // InternalMyunodsl.g:2496:10: lv_contestation_4_0= ruleContestations
            	    {

            	    										newCompositeNode(grammarAccess.getPenaliteAccess().getContestationContestationsParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_45);
            	    lv_contestation_4_0=ruleContestations();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPenaliteRule());
            	    										}
            	    										set(
            	    											current,
            	    											"contestation",
            	    											lv_contestation_4_0,
            	    											"org.example.myunodsl.Myunodsl.Contestations");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPenaliteAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyunodsl.g:2518:4: ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2518:4: ({...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) ) )
            	    // InternalMyunodsl.g:2519:5: {...}? => ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyunodsl.g:2519:105: ( ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) ) )
            	    // InternalMyunodsl.g:2520:6: ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyunodsl.g:2523:9: ({...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) ) )
            	    // InternalMyunodsl.g:2523:10: {...}? => ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "true");
            	    }
            	    // InternalMyunodsl.g:2523:19: ( (lv_tpsl_5_0= 'Tribunal Populaire si litige' ) )
            	    // InternalMyunodsl.g:2523:20: (lv_tpsl_5_0= 'Tribunal Populaire si litige' )
            	    {
            	    // InternalMyunodsl.g:2523:20: (lv_tpsl_5_0= 'Tribunal Populaire si litige' )
            	    // InternalMyunodsl.g:2524:10: lv_tpsl_5_0= 'Tribunal Populaire si litige'
            	    {
            	    lv_tpsl_5_0=(Token)match(input,71,FOLLOW_45); 

            	    										newLeafNode(lv_tpsl_5_0, grammarAccess.getPenaliteAccess().getTpslTribunalPopulaireSiLitigeKeyword_2_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPenaliteRule());
            	    										}
            	    										setWithLastConsumed(current, "tpsl", lv_tpsl_5_0, "Tribunal Populaire si litige");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPenaliteAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyunodsl.g:2541:4: ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2541:4: ({...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) ) )
            	    // InternalMyunodsl.g:2542:5: {...}? => ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyunodsl.g:2542:105: ( ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) ) )
            	    // InternalMyunodsl.g:2543:6: ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyunodsl.g:2546:9: ({...}? => ( (lv_ltps_6_0= 'Limite de temps' ) ) )
            	    // InternalMyunodsl.g:2546:10: {...}? => ( (lv_ltps_6_0= 'Limite de temps' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "true");
            	    }
            	    // InternalMyunodsl.g:2546:19: ( (lv_ltps_6_0= 'Limite de temps' ) )
            	    // InternalMyunodsl.g:2546:20: (lv_ltps_6_0= 'Limite de temps' )
            	    {
            	    // InternalMyunodsl.g:2546:20: (lv_ltps_6_0= 'Limite de temps' )
            	    // InternalMyunodsl.g:2547:10: lv_ltps_6_0= 'Limite de temps'
            	    {
            	    lv_ltps_6_0=(Token)match(input,72,FOLLOW_45); 

            	    										newLeafNode(lv_ltps_6_0, grammarAccess.getPenaliteAccess().getLtpsLimiteDeTempsKeyword_2_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPenaliteRule());
            	    										}
            	    										setWithLastConsumed(current, "ltps", lv_ltps_6_0, "Limite de temps");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPenaliteAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyunodsl.g:2564:4: ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2564:4: ({...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) ) )
            	    // InternalMyunodsl.g:2565:5: {...}? => ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "getUnorderedGroupHelper().canSelect(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyunodsl.g:2565:105: ( ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) ) )
            	    // InternalMyunodsl.g:2566:6: ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPenaliteAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyunodsl.g:2569:9: ({...}? => ( (lv_penalite_7_0= RULE_STRING ) ) )
            	    // InternalMyunodsl.g:2569:10: {...}? => ( (lv_penalite_7_0= RULE_STRING ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePenalite", "true");
            	    }
            	    // InternalMyunodsl.g:2569:19: ( (lv_penalite_7_0= RULE_STRING ) )
            	    // InternalMyunodsl.g:2569:20: (lv_penalite_7_0= RULE_STRING )
            	    {
            	    // InternalMyunodsl.g:2569:20: (lv_penalite_7_0= RULE_STRING )
            	    // InternalMyunodsl.g:2570:10: lv_penalite_7_0= RULE_STRING
            	    {
            	    lv_penalite_7_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            	    										newLeafNode(lv_penalite_7_0, grammarAccess.getPenaliteAccess().getPenaliteSTRINGTerminalRuleCall_2_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPenaliteRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"penalite",
            	    											lv_penalite_7_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPenaliteAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPenaliteAccess().getUnorderedGroup_2());
            				

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPenaliteAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePenalite"


    // $ANTLR start "entryRuleContestations"
    // InternalMyunodsl.g:2606:1: entryRuleContestations returns [EObject current=null] : iv_ruleContestations= ruleContestations EOF ;
    public final EObject entryRuleContestations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContestations = null;


        try {
            // InternalMyunodsl.g:2606:54: (iv_ruleContestations= ruleContestations EOF )
            // InternalMyunodsl.g:2607:2: iv_ruleContestations= ruleContestations EOF
            {
             newCompositeNode(grammarAccess.getContestationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContestations=ruleContestations();

            state._fsp--;

             current =iv_ruleContestations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContestations"


    // $ANTLR start "ruleContestations"
    // InternalMyunodsl.g:2613:1: ruleContestations returns [EObject current=null] : ( ( (lv_c_0_0= 'Contestations' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleContestations() throws RecognitionException {
        EObject current = null;

        Token lv_c_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_t_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_k_4_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:2619:2: ( ( ( (lv_c_0_0= 'Contestations' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* ) ) ) otherlv_9= '}' ) )
            // InternalMyunodsl.g:2620:2: ( ( (lv_c_0_0= 'Contestations' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* ) ) ) otherlv_9= '}' )
            {
            // InternalMyunodsl.g:2620:2: ( ( (lv_c_0_0= 'Contestations' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* ) ) ) otherlv_9= '}' )
            // InternalMyunodsl.g:2621:3: ( (lv_c_0_0= 'Contestations' ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* ) ) ) otherlv_9= '}'
            {
            // InternalMyunodsl.g:2621:3: ( (lv_c_0_0= 'Contestations' ) )
            // InternalMyunodsl.g:2622:4: (lv_c_0_0= 'Contestations' )
            {
            // InternalMyunodsl.g:2622:4: (lv_c_0_0= 'Contestations' )
            // InternalMyunodsl.g:2623:5: lv_c_0_0= 'Contestations'
            {
            lv_c_0_0=(Token)match(input,73,FOLLOW_3); 

            					newLeafNode(lv_c_0_0, grammarAccess.getContestationsAccess().getCContestationsKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContestationsRule());
            					}
            					setWithLastConsumed(current, "c", lv_c_0_0, "Contestations");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getContestationsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyunodsl.g:2639:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* ) ) )
            // InternalMyunodsl.g:2640:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* ) )
            {
            // InternalMyunodsl.g:2640:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* ) )
            // InternalMyunodsl.g:2641:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getContestationsAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:2644:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )* )
            // InternalMyunodsl.g:2645:6: ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )*
            {
            // InternalMyunodsl.g:2645:6: ( ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == 18 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 1) ) ) {
                    int LA26_2 = input.LA(2);

                    if ( LA26_2 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 1) ) {
                        alt26=2;
                    }
                    else if ( LA26_2 >= 83 && LA26_2 <= 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 0) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyunodsl.g:2646:4: ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2646:4: ({...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) ) )
            	    // InternalMyunodsl.g:2647:5: {...}? => ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContestations", "getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:2647:110: ( ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) ) )
            	    // InternalMyunodsl.g:2648:6: ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:2651:9: ({...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' ) )
            	    // InternalMyunodsl.g:2651:10: {...}? => (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContestations", "true");
            	    }
            	    // InternalMyunodsl.g:2651:19: (otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>' )
            	    // InternalMyunodsl.g:2651:20: otherlv_3= '<' ( (lv_k_4_0= rulePLUS_QUATRE ) ) otherlv_5= '>'
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_44); 

            	    									newLeafNode(otherlv_3, grammarAccess.getContestationsAccess().getLessThanSignKeyword_2_0_0());
            	    								
            	    // InternalMyunodsl.g:2655:9: ( (lv_k_4_0= rulePLUS_QUATRE ) )
            	    // InternalMyunodsl.g:2656:10: (lv_k_4_0= rulePLUS_QUATRE )
            	    {
            	    // InternalMyunodsl.g:2656:10: (lv_k_4_0= rulePLUS_QUATRE )
            	    // InternalMyunodsl.g:2657:11: lv_k_4_0= rulePLUS_QUATRE
            	    {

            	    											newCompositeNode(grammarAccess.getContestationsAccess().getKPLUS_QUATREParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_k_4_0=rulePLUS_QUATRE();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getContestationsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"k",
            	    												lv_k_4_0,
            	    												"org.example.myunodsl.Myunodsl.PLUS_QUATRE");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_5=(Token)match(input,23,FOLLOW_10); 

            	    									newLeafNode(otherlv_5, grammarAccess.getContestationsAccess().getGreaterThanSignKeyword_2_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContestationsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:2684:4: ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2684:4: ({...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) ) )
            	    // InternalMyunodsl.g:2685:5: {...}? => ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContestations", "getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:2685:110: ( ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) ) )
            	    // InternalMyunodsl.g:2686:6: ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContestationsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:2689:9: ({...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' ) )
            	    // InternalMyunodsl.g:2689:10: {...}? => (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContestations", "true");
            	    }
            	    // InternalMyunodsl.g:2689:19: (otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>' )
            	    // InternalMyunodsl.g:2689:20: otherlv_6= '<' ( (lv_t_7_0= 'se tromper' ) ) otherlv_8= '>'
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_46); 

            	    									newLeafNode(otherlv_6, grammarAccess.getContestationsAccess().getLessThanSignKeyword_2_1_0());
            	    								
            	    // InternalMyunodsl.g:2693:9: ( (lv_t_7_0= 'se tromper' ) )
            	    // InternalMyunodsl.g:2694:10: (lv_t_7_0= 'se tromper' )
            	    {
            	    // InternalMyunodsl.g:2694:10: (lv_t_7_0= 'se tromper' )
            	    // InternalMyunodsl.g:2695:11: lv_t_7_0= 'se tromper'
            	    {
            	    lv_t_7_0=(Token)match(input,74,FOLLOW_14); 

            	    											newLeafNode(lv_t_7_0, grammarAccess.getContestationsAccess().getTSeTromperKeyword_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getContestationsRule());
            	    											}
            	    											setWithLastConsumed(current, "t", lv_t_7_0, "se tromper");
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,23,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getContestationsAccess().getGreaterThanSignKeyword_2_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContestationsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getContestationsAccess().getUnorderedGroup_2());
            				

            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getContestationsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContestations"


    // $ANTLR start "entryRuleFin"
    // InternalMyunodsl.g:2732:1: entryRuleFin returns [EObject current=null] : iv_ruleFin= ruleFin EOF ;
    public final EObject entryRuleFin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFin = null;


        try {
            // InternalMyunodsl.g:2732:44: (iv_ruleFin= ruleFin EOF )
            // InternalMyunodsl.g:2733:2: iv_ruleFin= ruleFin EOF
            {
             newCompositeNode(grammarAccess.getFinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFin=ruleFin();

            state._fsp--;

             current =iv_ruleFin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFin"


    // $ANTLR start "ruleFin"
    // InternalMyunodsl.g:2739:1: ruleFin returns [EObject current=null] : ( ( (lv_f_0_0= 'Fin' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?) ) ) otherlv_5= ']' ) ;
    public final EObject ruleFin() throws RecognitionException {
        EObject current = null;

        Token lv_f_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_fdm_3_0 = null;

        EObject lv_fdp_4_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:2745:2: ( ( ( (lv_f_0_0= 'Fin' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?) ) ) otherlv_5= ']' ) )
            // InternalMyunodsl.g:2746:2: ( ( (lv_f_0_0= 'Fin' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?) ) ) otherlv_5= ']' )
            {
            // InternalMyunodsl.g:2746:2: ( ( (lv_f_0_0= 'Fin' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?) ) ) otherlv_5= ']' )
            // InternalMyunodsl.g:2747:3: ( (lv_f_0_0= 'Fin' ) ) otherlv_1= '[' ( ( ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?) ) ) otherlv_5= ']'
            {
            // InternalMyunodsl.g:2747:3: ( (lv_f_0_0= 'Fin' ) )
            // InternalMyunodsl.g:2748:4: (lv_f_0_0= 'Fin' )
            {
            // InternalMyunodsl.g:2748:4: (lv_f_0_0= 'Fin' )
            // InternalMyunodsl.g:2749:5: lv_f_0_0= 'Fin'
            {
            lv_f_0_0=(Token)match(input,75,FOLLOW_6); 

            					newLeafNode(lv_f_0_0, grammarAccess.getFinAccess().getFFinKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFinRule());
            					}
            					setWithLastConsumed(current, "f", lv_f_0_0, "Fin");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getFinAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyunodsl.g:2765:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?) ) )
            // InternalMyunodsl.g:2766:4: ( ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyunodsl.g:2766:4: ( ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?) )
            // InternalMyunodsl.g:2767:5: ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFinAccess().getUnorderedGroup_2());
            				
            // InternalMyunodsl.g:2770:5: ( ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?)
            // InternalMyunodsl.g:2771:6: ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+ {...}?
            {
            // InternalMyunodsl.g:2771:6: ( ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getFinAccess().getUnorderedGroup_2(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getFinAccess().getUnorderedGroup_2(), 1) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyunodsl.g:2772:4: ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2772:4: ({...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) ) )
            	    // InternalMyunodsl.g:2773:5: {...}? => ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFinAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFin", "getUnorderedGroupHelper().canSelect(grammarAccess.getFinAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyunodsl.g:2773:100: ( ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) ) )
            	    // InternalMyunodsl.g:2774:6: ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFinAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyunodsl.g:2777:9: ({...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) ) )
            	    // InternalMyunodsl.g:2777:10: {...}? => ( (lv_fdm_3_0= ruleFin_de_manche ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFin", "true");
            	    }
            	    // InternalMyunodsl.g:2777:19: ( (lv_fdm_3_0= ruleFin_de_manche ) )
            	    // InternalMyunodsl.g:2777:20: (lv_fdm_3_0= ruleFin_de_manche )
            	    {
            	    // InternalMyunodsl.g:2777:20: (lv_fdm_3_0= ruleFin_de_manche )
            	    // InternalMyunodsl.g:2778:10: lv_fdm_3_0= ruleFin_de_manche
            	    {

            	    										newCompositeNode(grammarAccess.getFinAccess().getFdmFin_de_mancheParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_48);
            	    lv_fdm_3_0=ruleFin_de_manche();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFinRule());
            	    										}
            	    										set(
            	    											current,
            	    											"fdm",
            	    											lv_fdm_3_0,
            	    											"org.example.myunodsl.Myunodsl.Fin_de_manche");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFinAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyunodsl.g:2800:4: ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) )
            	    {
            	    // InternalMyunodsl.g:2800:4: ({...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) ) )
            	    // InternalMyunodsl.g:2801:5: {...}? => ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFinAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFin", "getUnorderedGroupHelper().canSelect(grammarAccess.getFinAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyunodsl.g:2801:100: ( ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) ) )
            	    // InternalMyunodsl.g:2802:6: ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFinAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyunodsl.g:2805:9: ({...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) ) )
            	    // InternalMyunodsl.g:2805:10: {...}? => ( (lv_fdp_4_0= ruleFin_de_partie ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFin", "true");
            	    }
            	    // InternalMyunodsl.g:2805:19: ( (lv_fdp_4_0= ruleFin_de_partie ) )
            	    // InternalMyunodsl.g:2805:20: (lv_fdp_4_0= ruleFin_de_partie )
            	    {
            	    // InternalMyunodsl.g:2805:20: (lv_fdp_4_0= ruleFin_de_partie )
            	    // InternalMyunodsl.g:2806:10: lv_fdp_4_0= ruleFin_de_partie
            	    {

            	    										newCompositeNode(grammarAccess.getFinAccess().getFdpFin_de_partieParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_48);
            	    lv_fdp_4_0=ruleFin_de_partie();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFinRule());
            	    										}
            	    										set(
            	    											current,
            	    											"fdp",
            	    											lv_fdp_4_0,
            	    											"org.example.myunodsl.Myunodsl.Fin_de_partie");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFinAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFinAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleFin", "getUnorderedGroupHelper().canLeave(grammarAccess.getFinAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFinAccess().getUnorderedGroup_2());
            				

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFinAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFin"


    // $ANTLR start "entryRuleFin_de_manche"
    // InternalMyunodsl.g:2844:1: entryRuleFin_de_manche returns [EObject current=null] : iv_ruleFin_de_manche= ruleFin_de_manche EOF ;
    public final EObject entryRuleFin_de_manche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFin_de_manche = null;


        try {
            // InternalMyunodsl.g:2844:54: (iv_ruleFin_de_manche= ruleFin_de_manche EOF )
            // InternalMyunodsl.g:2845:2: iv_ruleFin_de_manche= ruleFin_de_manche EOF
            {
             newCompositeNode(grammarAccess.getFin_de_mancheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFin_de_manche=ruleFin_de_manche();

            state._fsp--;

             current =iv_ruleFin_de_manche; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFin_de_manche"


    // $ANTLR start "ruleFin_de_manche"
    // InternalMyunodsl.g:2851:1: ruleFin_de_manche returns [EObject current=null] : ( ( (lv_fdmdu_0_0= 'Fin de manche' ) ) otherlv_1= ':' ( (lv_du_2_0= 'Dire Uno' ) ) ) ;
    public final EObject ruleFin_de_manche() throws RecognitionException {
        EObject current = null;

        Token lv_fdmdu_0_0=null;
        Token otherlv_1=null;
        Token lv_du_2_0=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:2857:2: ( ( ( (lv_fdmdu_0_0= 'Fin de manche' ) ) otherlv_1= ':' ( (lv_du_2_0= 'Dire Uno' ) ) ) )
            // InternalMyunodsl.g:2858:2: ( ( (lv_fdmdu_0_0= 'Fin de manche' ) ) otherlv_1= ':' ( (lv_du_2_0= 'Dire Uno' ) ) )
            {
            // InternalMyunodsl.g:2858:2: ( ( (lv_fdmdu_0_0= 'Fin de manche' ) ) otherlv_1= ':' ( (lv_du_2_0= 'Dire Uno' ) ) )
            // InternalMyunodsl.g:2859:3: ( (lv_fdmdu_0_0= 'Fin de manche' ) ) otherlv_1= ':' ( (lv_du_2_0= 'Dire Uno' ) )
            {
            // InternalMyunodsl.g:2859:3: ( (lv_fdmdu_0_0= 'Fin de manche' ) )
            // InternalMyunodsl.g:2860:4: (lv_fdmdu_0_0= 'Fin de manche' )
            {
            // InternalMyunodsl.g:2860:4: (lv_fdmdu_0_0= 'Fin de manche' )
            // InternalMyunodsl.g:2861:5: lv_fdmdu_0_0= 'Fin de manche'
            {
            lv_fdmdu_0_0=(Token)match(input,76,FOLLOW_12); 

            					newLeafNode(lv_fdmdu_0_0, grammarAccess.getFin_de_mancheAccess().getFdmduFinDeMancheKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFin_de_mancheRule());
            					}
            					setWithLastConsumed(current, "fdmdu", lv_fdmdu_0_0, "Fin de manche");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getFin_de_mancheAccess().getColonKeyword_1());
            		
            // InternalMyunodsl.g:2877:3: ( (lv_du_2_0= 'Dire Uno' ) )
            // InternalMyunodsl.g:2878:4: (lv_du_2_0= 'Dire Uno' )
            {
            // InternalMyunodsl.g:2878:4: (lv_du_2_0= 'Dire Uno' )
            // InternalMyunodsl.g:2879:5: lv_du_2_0= 'Dire Uno'
            {
            lv_du_2_0=(Token)match(input,77,FOLLOW_2); 

            					newLeafNode(lv_du_2_0, grammarAccess.getFin_de_mancheAccess().getDuDireUnoKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFin_de_mancheRule());
            					}
            					setWithLastConsumed(current, "du", lv_du_2_0, "Dire Uno");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFin_de_manche"


    // $ANTLR start "entryRuleFin_de_partie"
    // InternalMyunodsl.g:2895:1: entryRuleFin_de_partie returns [EObject current=null] : iv_ruleFin_de_partie= ruleFin_de_partie EOF ;
    public final EObject entryRuleFin_de_partie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFin_de_partie = null;


        try {
            // InternalMyunodsl.g:2895:54: (iv_ruleFin_de_partie= ruleFin_de_partie EOF )
            // InternalMyunodsl.g:2896:2: iv_ruleFin_de_partie= ruleFin_de_partie EOF
            {
             newCompositeNode(grammarAccess.getFin_de_partieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFin_de_partie=ruleFin_de_partie();

            state._fsp--;

             current =iv_ruleFin_de_partie; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFin_de_partie"


    // $ANTLR start "ruleFin_de_partie"
    // InternalMyunodsl.g:2902:1: ruleFin_de_partie returns [EObject current=null] : ( ( ( (lv_fdpv_0_0= 'Fin de partie Vainceur' ) ) otherlv_1= ':' ) ( (lv_vaiqueur_2_0= ruleVainqueur ) ) ) ;
    public final EObject ruleFin_de_partie() throws RecognitionException {
        EObject current = null;

        Token lv_fdpv_0_0=null;
        Token otherlv_1=null;
        EObject lv_vaiqueur_2_0 = null;



        	enterRule();

        try {
            // InternalMyunodsl.g:2908:2: ( ( ( ( (lv_fdpv_0_0= 'Fin de partie Vainceur' ) ) otherlv_1= ':' ) ( (lv_vaiqueur_2_0= ruleVainqueur ) ) ) )
            // InternalMyunodsl.g:2909:2: ( ( ( (lv_fdpv_0_0= 'Fin de partie Vainceur' ) ) otherlv_1= ':' ) ( (lv_vaiqueur_2_0= ruleVainqueur ) ) )
            {
            // InternalMyunodsl.g:2909:2: ( ( ( (lv_fdpv_0_0= 'Fin de partie Vainceur' ) ) otherlv_1= ':' ) ( (lv_vaiqueur_2_0= ruleVainqueur ) ) )
            // InternalMyunodsl.g:2910:3: ( ( (lv_fdpv_0_0= 'Fin de partie Vainceur' ) ) otherlv_1= ':' ) ( (lv_vaiqueur_2_0= ruleVainqueur ) )
            {
            // InternalMyunodsl.g:2910:3: ( ( (lv_fdpv_0_0= 'Fin de partie Vainceur' ) ) otherlv_1= ':' )
            // InternalMyunodsl.g:2911:4: ( (lv_fdpv_0_0= 'Fin de partie Vainceur' ) ) otherlv_1= ':'
            {
            // InternalMyunodsl.g:2911:4: ( (lv_fdpv_0_0= 'Fin de partie Vainceur' ) )
            // InternalMyunodsl.g:2912:5: (lv_fdpv_0_0= 'Fin de partie Vainceur' )
            {
            // InternalMyunodsl.g:2912:5: (lv_fdpv_0_0= 'Fin de partie Vainceur' )
            // InternalMyunodsl.g:2913:6: lv_fdpv_0_0= 'Fin de partie Vainceur'
            {
            lv_fdpv_0_0=(Token)match(input,78,FOLLOW_12); 

            						newLeafNode(lv_fdpv_0_0, grammarAccess.getFin_de_partieAccess().getFdpvFinDePartieVainceurKeyword_0_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getFin_de_partieRule());
            						}
            						setWithLastConsumed(current, "fdpv", lv_fdpv_0_0, "Fin de partie Vainceur");
            					

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_50); 

            				newLeafNode(otherlv_1, grammarAccess.getFin_de_partieAccess().getColonKeyword_0_1());
            			

            }

            // InternalMyunodsl.g:2930:3: ( (lv_vaiqueur_2_0= ruleVainqueur ) )
            // InternalMyunodsl.g:2931:4: (lv_vaiqueur_2_0= ruleVainqueur )
            {
            // InternalMyunodsl.g:2931:4: (lv_vaiqueur_2_0= ruleVainqueur )
            // InternalMyunodsl.g:2932:5: lv_vaiqueur_2_0= ruleVainqueur
            {

            					newCompositeNode(grammarAccess.getFin_de_partieAccess().getVaiqueurVainqueurParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_vaiqueur_2_0=ruleVainqueur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFin_de_partieRule());
            					}
            					set(
            						current,
            						"vaiqueur",
            						lv_vaiqueur_2_0,
            						"org.example.myunodsl.Myunodsl.Vainqueur");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFin_de_partie"


    // $ANTLR start "entryRuleVainqueur"
    // InternalMyunodsl.g:2953:1: entryRuleVainqueur returns [EObject current=null] : iv_ruleVainqueur= ruleVainqueur EOF ;
    public final EObject entryRuleVainqueur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVainqueur = null;


        try {
            // InternalMyunodsl.g:2953:50: (iv_ruleVainqueur= ruleVainqueur EOF )
            // InternalMyunodsl.g:2954:2: iv_ruleVainqueur= ruleVainqueur EOF
            {
             newCompositeNode(grammarAccess.getVainqueurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVainqueur=ruleVainqueur();

            state._fsp--;

             current =iv_ruleVainqueur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVainqueur"


    // $ANTLR start "ruleVainqueur"
    // InternalMyunodsl.g:2960:1: ruleVainqueur returns [EObject current=null] : ( ( (lv_manches_0_0= 'nombre de manches gagn\\u00E9es' ) ) | ( (lv_moins_1_0= 'moins de points' ) ) | ( (lv_dernier_2_0= 'dernier : battle royale' ) ) | ( (lv_plus_3_0= 'plus de points' ) ) ) ;
    public final EObject ruleVainqueur() throws RecognitionException {
        EObject current = null;

        Token lv_manches_0_0=null;
        Token lv_moins_1_0=null;
        Token lv_dernier_2_0=null;
        Token lv_plus_3_0=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:2966:2: ( ( ( (lv_manches_0_0= 'nombre de manches gagn\\u00E9es' ) ) | ( (lv_moins_1_0= 'moins de points' ) ) | ( (lv_dernier_2_0= 'dernier : battle royale' ) ) | ( (lv_plus_3_0= 'plus de points' ) ) ) )
            // InternalMyunodsl.g:2967:2: ( ( (lv_manches_0_0= 'nombre de manches gagn\\u00E9es' ) ) | ( (lv_moins_1_0= 'moins de points' ) ) | ( (lv_dernier_2_0= 'dernier : battle royale' ) ) | ( (lv_plus_3_0= 'plus de points' ) ) )
            {
            // InternalMyunodsl.g:2967:2: ( ( (lv_manches_0_0= 'nombre de manches gagn\\u00E9es' ) ) | ( (lv_moins_1_0= 'moins de points' ) ) | ( (lv_dernier_2_0= 'dernier : battle royale' ) ) | ( (lv_plus_3_0= 'plus de points' ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt28=1;
                }
                break;
            case 80:
                {
                alt28=2;
                }
                break;
            case 81:
                {
                alt28=3;
                }
                break;
            case 82:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyunodsl.g:2968:3: ( (lv_manches_0_0= 'nombre de manches gagn\\u00E9es' ) )
                    {
                    // InternalMyunodsl.g:2968:3: ( (lv_manches_0_0= 'nombre de manches gagn\\u00E9es' ) )
                    // InternalMyunodsl.g:2969:4: (lv_manches_0_0= 'nombre de manches gagn\\u00E9es' )
                    {
                    // InternalMyunodsl.g:2969:4: (lv_manches_0_0= 'nombre de manches gagn\\u00E9es' )
                    // InternalMyunodsl.g:2970:5: lv_manches_0_0= 'nombre de manches gagn\\u00E9es'
                    {
                    lv_manches_0_0=(Token)match(input,79,FOLLOW_2); 

                    					newLeafNode(lv_manches_0_0, grammarAccess.getVainqueurAccess().getManchesNombreDeManchesGagnEsKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVainqueurRule());
                    					}
                    					setWithLastConsumed(current, "manches", lv_manches_0_0, "nombre de manches gagn\u00E9es");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:2983:3: ( (lv_moins_1_0= 'moins de points' ) )
                    {
                    // InternalMyunodsl.g:2983:3: ( (lv_moins_1_0= 'moins de points' ) )
                    // InternalMyunodsl.g:2984:4: (lv_moins_1_0= 'moins de points' )
                    {
                    // InternalMyunodsl.g:2984:4: (lv_moins_1_0= 'moins de points' )
                    // InternalMyunodsl.g:2985:5: lv_moins_1_0= 'moins de points'
                    {
                    lv_moins_1_0=(Token)match(input,80,FOLLOW_2); 

                    					newLeafNode(lv_moins_1_0, grammarAccess.getVainqueurAccess().getMoinsMoinsDePointsKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVainqueurRule());
                    					}
                    					setWithLastConsumed(current, "moins", lv_moins_1_0, "moins de points");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyunodsl.g:2998:3: ( (lv_dernier_2_0= 'dernier : battle royale' ) )
                    {
                    // InternalMyunodsl.g:2998:3: ( (lv_dernier_2_0= 'dernier : battle royale' ) )
                    // InternalMyunodsl.g:2999:4: (lv_dernier_2_0= 'dernier : battle royale' )
                    {
                    // InternalMyunodsl.g:2999:4: (lv_dernier_2_0= 'dernier : battle royale' )
                    // InternalMyunodsl.g:3000:5: lv_dernier_2_0= 'dernier : battle royale'
                    {
                    lv_dernier_2_0=(Token)match(input,81,FOLLOW_2); 

                    					newLeafNode(lv_dernier_2_0, grammarAccess.getVainqueurAccess().getDernierDernierBattleRoyaleKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVainqueurRule());
                    					}
                    					setWithLastConsumed(current, "dernier", lv_dernier_2_0, "dernier : battle royale");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyunodsl.g:3013:3: ( (lv_plus_3_0= 'plus de points' ) )
                    {
                    // InternalMyunodsl.g:3013:3: ( (lv_plus_3_0= 'plus de points' ) )
                    // InternalMyunodsl.g:3014:4: (lv_plus_3_0= 'plus de points' )
                    {
                    // InternalMyunodsl.g:3014:4: (lv_plus_3_0= 'plus de points' )
                    // InternalMyunodsl.g:3015:5: lv_plus_3_0= 'plus de points'
                    {
                    lv_plus_3_0=(Token)match(input,82,FOLLOW_2); 

                    					newLeafNode(lv_plus_3_0, grammarAccess.getVainqueurAccess().getPlusPlusDePointsKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVainqueurRule());
                    					}
                    					setWithLastConsumed(current, "plus", lv_plus_3_0, "plus de points");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVainqueur"


    // $ANTLR start "entryRulePLUS_QUATRE"
    // InternalMyunodsl.g:3031:1: entryRulePLUS_QUATRE returns [EObject current=null] : iv_rulePLUS_QUATRE= rulePLUS_QUATRE EOF ;
    public final EObject entryRulePLUS_QUATRE() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePLUS_QUATRE = null;


        try {
            // InternalMyunodsl.g:3031:52: (iv_rulePLUS_QUATRE= rulePLUS_QUATRE EOF )
            // InternalMyunodsl.g:3032:2: iv_rulePLUS_QUATRE= rulePLUS_QUATRE EOF
            {
             newCompositeNode(grammarAccess.getPLUS_QUATRERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePLUS_QUATRE=rulePLUS_QUATRE();

            state._fsp--;

             current =iv_rulePLUS_QUATRE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePLUS_QUATRE"


    // $ANTLR start "rulePLUS_QUATRE"
    // InternalMyunodsl.g:3038:1: rulePLUS_QUATRE returns [EObject current=null] : ( ( (lv_plq_0_0= 'Plus 4' ) ) | ( (lv_pq_1_0= '+4' ) ) ) ;
    public final EObject rulePLUS_QUATRE() throws RecognitionException {
        EObject current = null;

        Token lv_plq_0_0=null;
        Token lv_pq_1_0=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:3044:2: ( ( ( (lv_plq_0_0= 'Plus 4' ) ) | ( (lv_pq_1_0= '+4' ) ) ) )
            // InternalMyunodsl.g:3045:2: ( ( (lv_plq_0_0= 'Plus 4' ) ) | ( (lv_pq_1_0= '+4' ) ) )
            {
            // InternalMyunodsl.g:3045:2: ( ( (lv_plq_0_0= 'Plus 4' ) ) | ( (lv_pq_1_0= '+4' ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==83) ) {
                alt29=1;
            }
            else if ( (LA29_0==84) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyunodsl.g:3046:3: ( (lv_plq_0_0= 'Plus 4' ) )
                    {
                    // InternalMyunodsl.g:3046:3: ( (lv_plq_0_0= 'Plus 4' ) )
                    // InternalMyunodsl.g:3047:4: (lv_plq_0_0= 'Plus 4' )
                    {
                    // InternalMyunodsl.g:3047:4: (lv_plq_0_0= 'Plus 4' )
                    // InternalMyunodsl.g:3048:5: lv_plq_0_0= 'Plus 4'
                    {
                    lv_plq_0_0=(Token)match(input,83,FOLLOW_2); 

                    					newLeafNode(lv_plq_0_0, grammarAccess.getPLUS_QUATREAccess().getPlqPlus4Keyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPLUS_QUATRERule());
                    					}
                    					setWithLastConsumed(current, "plq", lv_plq_0_0, "Plus 4");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:3061:3: ( (lv_pq_1_0= '+4' ) )
                    {
                    // InternalMyunodsl.g:3061:3: ( (lv_pq_1_0= '+4' ) )
                    // InternalMyunodsl.g:3062:4: (lv_pq_1_0= '+4' )
                    {
                    // InternalMyunodsl.g:3062:4: (lv_pq_1_0= '+4' )
                    // InternalMyunodsl.g:3063:5: lv_pq_1_0= '+4'
                    {
                    lv_pq_1_0=(Token)match(input,84,FOLLOW_2); 

                    					newLeafNode(lv_pq_1_0, grammarAccess.getPLUS_QUATREAccess().getPq4Keyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPLUS_QUATRERule());
                    					}
                    					setWithLastConsumed(current, "pq", lv_pq_1_0, "+4");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePLUS_QUATRE"


    // $ANTLR start "entryRulePLUS_DEUX"
    // InternalMyunodsl.g:3079:1: entryRulePLUS_DEUX returns [EObject current=null] : iv_rulePLUS_DEUX= rulePLUS_DEUX EOF ;
    public final EObject entryRulePLUS_DEUX() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePLUS_DEUX = null;


        try {
            // InternalMyunodsl.g:3079:50: (iv_rulePLUS_DEUX= rulePLUS_DEUX EOF )
            // InternalMyunodsl.g:3080:2: iv_rulePLUS_DEUX= rulePLUS_DEUX EOF
            {
             newCompositeNode(grammarAccess.getPLUS_DEUXRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePLUS_DEUX=rulePLUS_DEUX();

            state._fsp--;

             current =iv_rulePLUS_DEUX; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePLUS_DEUX"


    // $ANTLR start "rulePLUS_DEUX"
    // InternalMyunodsl.g:3086:1: rulePLUS_DEUX returns [EObject current=null] : ( ( (lv_pld_0_0= 'Plus 2' ) ) | ( (lv_pd_1_0= '+2' ) ) ) ;
    public final EObject rulePLUS_DEUX() throws RecognitionException {
        EObject current = null;

        Token lv_pld_0_0=null;
        Token lv_pd_1_0=null;


        	enterRule();

        try {
            // InternalMyunodsl.g:3092:2: ( ( ( (lv_pld_0_0= 'Plus 2' ) ) | ( (lv_pd_1_0= '+2' ) ) ) )
            // InternalMyunodsl.g:3093:2: ( ( (lv_pld_0_0= 'Plus 2' ) ) | ( (lv_pd_1_0= '+2' ) ) )
            {
            // InternalMyunodsl.g:3093:2: ( ( (lv_pld_0_0= 'Plus 2' ) ) | ( (lv_pd_1_0= '+2' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==85) ) {
                alt30=1;
            }
            else if ( (LA30_0==86) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyunodsl.g:3094:3: ( (lv_pld_0_0= 'Plus 2' ) )
                    {
                    // InternalMyunodsl.g:3094:3: ( (lv_pld_0_0= 'Plus 2' ) )
                    // InternalMyunodsl.g:3095:4: (lv_pld_0_0= 'Plus 2' )
                    {
                    // InternalMyunodsl.g:3095:4: (lv_pld_0_0= 'Plus 2' )
                    // InternalMyunodsl.g:3096:5: lv_pld_0_0= 'Plus 2'
                    {
                    lv_pld_0_0=(Token)match(input,85,FOLLOW_2); 

                    					newLeafNode(lv_pld_0_0, grammarAccess.getPLUS_DEUXAccess().getPldPlus2Keyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPLUS_DEUXRule());
                    					}
                    					setWithLastConsumed(current, "pld", lv_pld_0_0, "Plus 2");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyunodsl.g:3109:3: ( (lv_pd_1_0= '+2' ) )
                    {
                    // InternalMyunodsl.g:3109:3: ( (lv_pd_1_0= '+2' ) )
                    // InternalMyunodsl.g:3110:4: (lv_pd_1_0= '+2' )
                    {
                    // InternalMyunodsl.g:3110:4: (lv_pd_1_0= '+2' )
                    // InternalMyunodsl.g:3111:5: lv_pd_1_0= '+2'
                    {
                    lv_pd_1_0=(Token)match(input,86,FOLLOW_2); 

                    					newLeafNode(lv_pd_1_0, grammarAccess.getPLUS_DEUXAccess().getPd2Keyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPLUS_DEUXRule());
                    					}
                    					setWithLastConsumed(current, "pd", lv_pd_1_0, "+2");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePLUS_DEUX"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000200000004000L,0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200000006000L,0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000048900020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000048900030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400080000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000400080010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001800000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x9028000000002000L,0x0000000000180000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x9038000000002000L,0x0000000000780000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x05C0000000002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x9028000000002000L,0x0000000000780000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x9028000000002000L,0x0000000000180010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x9028000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000002010L,0x00000000000003C0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000010000L,0x0000000000005000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});

}
