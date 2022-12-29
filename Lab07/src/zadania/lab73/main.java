package zadania.lab73;

class main
{
	public static void main(String[] arg)
	{
		Prostokat pr1 = new Prostokat(3, 6, "czerwony");
		Trojkat rownoboczny = new Trojkat(7, 4, "bialy");
		Punkt pkt1 = new Punkt(3,4);
		Kwadrat kw1 = new Kwadrat(3, "zielony");
		//Figura fig1 = new Figura();

		System.out.println(pr1.opis());
		System.out.println(rownoboczny.opis());
		//fig1.getKolor();

		Figura [] tablicaFigur = new Figura[10]; //pkt6
		for (int i = 0; i < tablicaFigur.length; i++){
			if(i < 5){
				tablicaFigur[i] = new Prostokat(5,3, "nieieski");
			}
			else{
				tablicaFigur[i] = new Trojkat(2,5,"czerwony");
			}
		}

		//maly_punkt.zwieksz(3,4);
		
	}
}