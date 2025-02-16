
public class Programa {

    public static void main(String[] args) {
        Corpos();

    }

    static void Corpos() {

        CorpoCeleste[] corpos = {
            new CorpoCeleste(32, 21, 3, 2),
            new CorpoCeleste(321, 11, 4521, 32),
            new CorpoCeleste(432, 123, 2, 1512),
            new CorpoCeleste(32, 123, 3412, 21),
            new CorpoCeleste(89231, 3216, 1245, 32145),
            new CorpoCeleste(631, 2542, 123461, 251),
            new CorpoCeleste(8543, 43462, 785432, 8653),
            new CorpoCeleste(231, 4251, 234, 22221),
            new CorpoCeleste(1235, 5543, 32, 1414),
            new CorpoCeleste(34, 142, 872, 362)
        };

        for (int i = 0; i < corpos.length; i++) {
            System.out.println("Corpo Celeste :" + (i + 1) + ":");
            System.out.println("Massa : " + corpos[i].getmassa());
            System.out.println("Densidade : " + corpos[i].getdensidade());
            System.out.println("PosX : " + corpos[i].getposx());
            System.out.println("PosY : " + corpos[i].getposy());
            System.out.println("----------------------------");
        }

        CorpoCeleste maiorMassaObj = corpos[0];
        CorpoCeleste maiorDensidadeObj = corpos[0];
        CorpoCeleste maiorPosXObj = corpos[0];
        CorpoCeleste maiorPosYObj = corpos[0];

        for (int o = 1; o < corpos.length; o++) {
            if (corpos[o].getmassa() > maiorMassaObj.getmassa()) {
                maiorMassaObj = corpos[o];
            }
            if (corpos[o].getdensidade() > maiorDensidadeObj.getdensidade()) {
                maiorDensidadeObj = corpos[o];
            }
            if (corpos[o].getposx() > maiorPosXObj.getposx()) {
                maiorPosXObj = corpos[o];
            }
            if (corpos[o].getposy() > maiorPosYObj.getposy()) {
                maiorPosYObj = corpos[o];

            }

        }
        System.out.println("======== Valores Maiores =======");
        System.out.println("Maior Massa: " + maiorMassaObj);
        System.out.println("Maior Densidade: " + maiorDensidadeObj);
        System.out.println("Maior Posição X: " + maiorPosXObj);
        System.out.println("Maior Posição Y: " + maiorPosYObj);
    }

}
