Uno{
	Deroulement
	[
		cartes
		{
			Plus 4
			{
				+4 seulement si rien d autre
				Interdit de finir avec un +4 
			}
		}
		Penalites
		{
		"Penalite"
		
		Contestations
		 {
		 	<+4>
		 	<se tromper>
		 }
		 commentaire intempestif
		}
		Piocher{
			Nombre de carte : 1 carte
			seulement si on ne peut pas jouer
		}
	]
	Configuration[
		Jeu : Solo
		Nombre de joueur : 3-10
		Nombre de talons { 
		1 talon
		}
		Rotation{
			Sens de distribution
		}
		Main{
			<Nombre de cartes de depart : 7 cartes>
			<Nombre de mains de depart: 1 main>
			<Visibilite:Cachée>
		}
		]
		Fin[
			Fin de manche :Dire Uno
			Fin de partie Vainceur : moins de points
		]
}