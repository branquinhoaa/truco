
/**
 * Created by Amanda on 04/01/2016.
 */
public class FabricaDeBaralho {
 Carta [] baralho = new Carta [28];
    int aux = 0;



    void criaBaralho(){
        int aux = 0;
         for (int n=1;n<5;n++){
            for (int numero=1;numero<7;numero++){
                baralho[aux] = new Carta();
                if (n==1){
                    baralho[aux].naipe = "paus" ;
                    baralho[aux].value = numero;
                } if (n==2){
                    baralho[aux].naipe = "ouro" ;
                    baralho[aux].value = numero;
                }if (n==3){
                    baralho[aux].naipe = "copas" ;
                    baralho[aux].value = numero;
                }if (n==4){
                    baralho[aux].naipe = "espada" ;
                    baralho[aux].value = numero;
                }

                baralho[aux].numero = numero;

                aux = aux+1;
            }

        }
        baralho[24] = new Carta();
        baralho[24].naipe = "paus";
        baralho[24].numero = 4;
        baralho[24].value = 20;

        baralho[25] = new Carta();
        baralho[25].naipe = "espada";
        baralho[25].numero = 1;
        baralho[25].value = 18;

        baralho[26] = new Carta();
        baralho[26].naipe = "copas";
        baralho[26].numero = 7;
        baralho[26].value = 16;

        baralho[27] = new Carta();
        baralho[27].naipe = "ouro";
        baralho[27].numero = 7;
        baralho[27].value = 14;
    }


   public void embaralha (){
        Carta guard=new Carta();
        for (int i=0;i<28;i++){
            int nAleat=(int)(Math.random() * 27);
            guard = baralho [i];
            baralho[i] = baralho [nAleat];
            baralho [nAleat] = guard;
        }

    }

     Carta daCartas(){
        Carta [] nova = new Carta [baralho.length-1];
        Carta cartaDada = baralho [aux];
         aux = aux +1;

         for (int i=0; i<nova.length; i++){
             nova[i]=baralho[i];
         }
         baralho=nova;
         return cartaDada;
    }

    public void revelaCarta(Carta carta){
        System.out.println( " número: " + carta.numero + " de Naipe: " + carta.naipe + " e valor: " + carta.value + "");
    }

    private void mostraBaralho(){
        for (int i=0; i<baralho.length; i++){
            System.out.println(" naipe: "+ baralho[i].naipe + " numero: " + baralho[i].numero + " valor da carta: " + baralho[i].value);
        }
    }
}


