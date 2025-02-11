/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyUnoDslGrammarAccess;

@SuppressWarnings("all")
public class MyUnoDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyUnoDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Jouer_plusieurs_cartes_CouleurKeyword_1_q;
	protected AbstractElementAlias match_Jouer_plusieurs_cartes_NombreKeyword_2_q;
	protected AbstractElementAlias match_Jouer_plusieurs_cartes___NombreKeyword_2_or___CouleurKeyword_1_NombreKeyword_2____q;
	protected AbstractElementAlias match_Penalite___CommentaireKeyword_0_0_IntempestifKeyword_0_1__q;
	protected AbstractElementAlias match_Penalite___LimiteKeyword_3_0_DeKeyword_3_1_TempsKeyword_3_2__q;
	protected AbstractElementAlias match_Penalite___TribunalKeyword_2_0_PopulaireKeyword_2_1_SiKeyword_2_2_LitigeKeyword_2_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyUnoDslGrammarAccess) access;
		match_Jouer_plusieurs_cartes_CouleurKeyword_1_q = new TokenAlias(false, true, grammarAccess.getJouer_plusieurs_cartesAccess().getCouleurKeyword_1());
		match_Jouer_plusieurs_cartes_NombreKeyword_2_q = new TokenAlias(false, true, grammarAccess.getJouer_plusieurs_cartesAccess().getNombreKeyword_2());
		match_Jouer_plusieurs_cartes___NombreKeyword_2_or___CouleurKeyword_1_NombreKeyword_2____q = new AlternativeAlias(false, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getJouer_plusieurs_cartesAccess().getCouleurKeyword_1()), new TokenAlias(false, false, grammarAccess.getJouer_plusieurs_cartesAccess().getNombreKeyword_2())), new TokenAlias(false, false, grammarAccess.getJouer_plusieurs_cartesAccess().getNombreKeyword_2()));
		match_Penalite___CommentaireKeyword_0_0_IntempestifKeyword_0_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPenaliteAccess().getCommentaireKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPenaliteAccess().getIntempestifKeyword_0_1()));
		match_Penalite___LimiteKeyword_3_0_DeKeyword_3_1_TempsKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPenaliteAccess().getLimiteKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getPenaliteAccess().getDeKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getPenaliteAccess().getTempsKeyword_3_2()));
		match_Penalite___TribunalKeyword_2_0_PopulaireKeyword_2_1_SiKeyword_2_2_LitigeKeyword_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPenaliteAccess().getTribunalKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getPenaliteAccess().getPopulaireKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getPenaliteAccess().getSiKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getPenaliteAccess().getLitigeKeyword_2_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getContestationsRule())
			return getContestationsToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Contestations : ("plus" "4")? ("se" "tromper")? ;
	 */
	protected String getContestationsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Jouer_plusieurs_cartes_CouleurKeyword_1_q.equals(syntax))
				emit_Jouer_plusieurs_cartes_CouleurKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Jouer_plusieurs_cartes_NombreKeyword_2_q.equals(syntax))
				emit_Jouer_plusieurs_cartes_NombreKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Jouer_plusieurs_cartes___NombreKeyword_2_or___CouleurKeyword_1_NombreKeyword_2____q.equals(syntax))
				emit_Jouer_plusieurs_cartes___NombreKeyword_2_or___CouleurKeyword_1_NombreKeyword_2____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Penalite___CommentaireKeyword_0_0_IntempestifKeyword_0_1__q.equals(syntax))
				emit_Penalite___CommentaireKeyword_0_0_IntempestifKeyword_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Penalite___LimiteKeyword_3_0_DeKeyword_3_1_TempsKeyword_3_2__q.equals(syntax))
				emit_Penalite___LimiteKeyword_3_0_DeKeyword_3_1_TempsKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Penalite___TribunalKeyword_2_0_PopulaireKeyword_2_1_SiKeyword_2_2_LitigeKeyword_2_3__q.equals(syntax))
				emit_Penalite___TribunalKeyword_2_0_PopulaireKeyword_2_1_SiKeyword_2_2_LitigeKeyword_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'couleur'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'nombre'? (rule start)
	 *     (rule start) (ambiguity) 'nombre'? cus=cartes_Uno_Speciales
	 *     s=Suites (ambiguity) 'nombre'? (rule end)
	 *     s=Suites (ambiguity) 'nombre'? cus=cartes_Uno_Speciales
	 */
	protected void emit_Jouer_plusieurs_cartes_CouleurKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'nombre'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'couleur'? (ambiguity) (rule start)
	 *     (rule start) 'couleur'? (ambiguity) cus=cartes_Uno_Speciales
	 *     s=Suites 'couleur'? (ambiguity) (rule end)
	 *     s=Suites 'couleur'? (ambiguity) cus=cartes_Uno_Speciales
	 */
	protected void emit_Jouer_plusieurs_cartes_NombreKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (('couleur' 'nombre') | 'nombre')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Jouer_plusieurs_cartes___NombreKeyword_2_or___CouleurKeyword_1_NombreKeyword_2____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('commentaire' 'intempestif')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) Contestations ('Tribunal' 'Populaire' 'si' 'litige')? ('Limite' 'de' 'temps')? (rule start)
	 *     (rule start) (ambiguity) Contestations ('Tribunal' 'Populaire' 'si' 'litige')? ('Limite' 'de' 'temps')? penalite=STRING
	 */
	protected void emit_Penalite___CommentaireKeyword_0_0_IntempestifKeyword_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('Limite' 'de' 'temps')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('commentaire' 'intempestif')? Contestations ('Tribunal' 'Populaire' 'si' 'litige')? (ambiguity) (rule start)
	 *     (rule start) ('commentaire' 'intempestif')? Contestations ('Tribunal' 'Populaire' 'si' 'litige')? (ambiguity) penalite=STRING
	 */
	protected void emit_Penalite___LimiteKeyword_3_0_DeKeyword_3_1_TempsKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('Tribunal' 'Populaire' 'si' 'litige')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('commentaire' 'intempestif')? Contestations (ambiguity) ('Limite' 'de' 'temps')? (rule start)
	 *     (rule start) ('commentaire' 'intempestif')? Contestations (ambiguity) ('Limite' 'de' 'temps')? penalite=STRING
	 */
	protected void emit_Penalite___TribunalKeyword_2_0_PopulaireKeyword_2_1_SiKeyword_2_2_LitigeKeyword_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
