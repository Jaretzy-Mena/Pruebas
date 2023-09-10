import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        System.out.println("Menú de cuerpos geométricos");
        System.out.println("1. Casquete esférico   2.Cilindro");
        System.out.println("3.Cono                 4.Dodecaedro");
        System.out.println("5.Esfera               6.Hexaedro");
        System.out.println("7.Hueso eférico y cuña esférico");
        System.out.println("8.Icosaedro            9.Octaedro");
        System.out.println("10.Ortoedro           11.Pirámide");
        System.out.println("12.Prisma             13.Tetraedro");
        System.out.println("14.Tronco de cono     15.Tronco de pirámide");
        System.out.println("16.Zona Esférica      17.Salir");
        int menu = lector.nextInt();
        int n=0;
        
        if(menu>17){
            do{
               System.out.println("Opción inválida");
               System.out.println("Elija una opción válida");
               menu =lector.nextByte();
               if(menu<17){
                n++;
               }
            }while(n<=0 || n>=3);
        }

        switch(menu){
            case 1->{
                System.out.println("Casquete esférico");
                double altura, radio;
                double volumen, area;
                do{
                    System.out.print("Ingrese la altura del casquete esférico: ");
                    altura = lector.nextDouble();
                }while(altura<0);

                do{
                    System.out.print("Ingrese el radio de la esfera: ");
                    radio =lector.nextDouble();
                }while(radio<0);
                //separador
                volumen=(((Math.PI*altura*altura)*((3*radio)-(altura)))/(3));
                area=(2*Math.PI*altura*radio);
                //ultimoSeparador
                System.out.println("El area es de: " + area);
                System.out.println("El volumen es de "+ volumen);
            }

            case 2->{
                System.out.println("Cilindro");
                double radio, altura;
                double BaseP, BaseA;
                double Volumen, AreaT, AreaL;
                do{
                    System.out.print("Ingrese radio: ");
                    radio = lector.nextDouble();
                }while(radio<0);
                do{
                    System.out.print("Ingrese altura: ");
                    altura = lector.nextDouble();
                }while(altura<0);
                BaseP=(2 * Math.PI * radio);
                BaseA=(Math.PI * radio * radio);
                AreaL=(BaseP * altura);
                AreaT=(AreaL)+(2*BaseA);
                Volumen=(BaseA*altura);
                System.out.println("Area lateral: " + AreaL + " unidades cuadradas");
                System.out.println("Area total: " + AreaT + " unidades cuadradas");
                System.out.println("Volumen: " + Volumen + " unidades cuadradas");
            }

            case 3->{
                System.out.println("Cono");
                double altura;
                double generatriz, generatrizG, radio;
                double Volumen, AreaT, AreaL;
                do{
                    System.out.print("Ingrese altura: ");
                    altura = lector.nextDouble();
                }while(altura<0);
                do{
                    System.out.print("Ingrese radio: ");
                    radio = lector.nextDouble();
                }while(radio<0);
                //procedimiento
                generatriz=(Math.sqrt((radio*radio)+(altura*altura)));
                generatrizG=generatriz;
                AreaL=(Math.PI*radio*generatrizG);
                AreaT=(Math.PI*radio)*(generatrizG+radio);
                Volumen=(Math.PI*radio*radio*altura)/(3);
                //procedimiento        
                System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
                System.out.println("Area total: " + AreaT + " unidades cuadradas.");
                System.out.println("Volumen: " + Volumen + " unidades cubicas.");
            }

            case 4->{
                System.out.println("Dodecaedro");
                double largo;
                double volumen, Area, AreaP;

                do{
                    System.out.print("Ingrese la longitud de la arista: ");
                    largo=lector.nextDouble();
                }while(largo<0);
                //
                Area=((3*largo*largo)*(Math.sqrt((25)+(10*Math.sqrt(5)))));
                volumen=(((15)+(7*Math.sqrt(5)))*(largo*largo*largo)/(4));
                AreaP=((Area)/(12));
                //
                System.out.println("El area es de: "+Area);
                System.out.println("El volumen es de: "+volumen);
                System.out.println("Area de la cara del dodecaedro: "+AreaP);
            }

            case 5->{
                System.out.println("Esfera");
                double radio;
                double Area, Volumen;
                //datos
                do{
                    System.out.print("ingrese radio: ");
                    radio=lector.nextDouble();
                }while(radio<0);
                //procedimiento
                Area =(4*Math.PI)*(radio*radio);
                Volumen =(((4)*(Math.PI*radio*radio*radio))/(3));
                //procediminento
                System.out.println("El area es de: " + Area);
                System.out.println("El volumen es de: "+Volumen);
            }

            case 6->{
                System.out.println("Hexaedro");
                double largo;
                double diametro, volumen, Area;

                do{
                    System.out.print("Ingrese la longitud de la arista del hexaedro: ");
                    largo=lector.nextDouble();
                }while(largo<0);

                Area=((largo*largo)*(6));
                diametro=(largo)*((Math.sqrt(3)));
                volumen=(largo*largo*largo);
                System.out.println("El area es de "+Area);
                System.out.println("El volumen es de "+volumen);
                System.out.println("El diametro es de "+diametro);
            }

            case 7->{
                System.out.println("Hueso esférico y cuña esférica");
                double radio, grados;
                double area, volumen;
        
                do{
                    System.out.print("Ingrese radio: ");
                    radio =lector.nextDouble();
                }while(radio<0);
                do{
                    System.out.print("Ingrese grados: ");
                    grados =lector.nextDouble();
                }while(grados<0 ||grados>360);
        
                area=((4*Math.PI*radio*radio*grados)/(360));
                volumen=((4)*((Math.PI*radio*radio*radio*grados)/(360*3)));
                System.out.println("El area es de: "+ area);
                System.out.println("El volumen es de: "+volumen);
            }

            case 8->{
                System.out.println("Icosaedro");
                double largo;
                double volumen, Area;
                do{
                    System.out.println("Ingrese la longitud de la arista del icosaedro: ");
                    largo=lector.nextDouble();
                }while(largo<0);

                Area=(((largo*largo)*(5))*Math.sqrt(3));
                volumen=(((5)*(3+(Math.sqrt(5)))*(largo*largo*largo))/(12));
                //
                System.out.println("El area es de "+Area);
                   System.out.println("El volumen es de "+volumen);
            }

            case 9->{
                System.out.println("Octaedro");
                double largo;
                double volumen, Area;

                do{
                    System.out.print("Ingrese la longitud de la arista del octedro: ");
                    largo=lector.nextDouble();
                }while(largo<0);
                Area=(((largo*largo)*(2))*Math.sqrt(3));
                volumen=(((Math.sqrt(2))*(largo*largo*largo))/(3));
                System.out.println("El area es de "+Area);
                System.out.println("El volumen es de "+volumen);
            }

            case 10->{
                System.out.println("Ortoedro");
                double largo, baseMA, baseme;
                double diametro, volumen, Area;
                do{
                    System.out.print("Ingrese largo: ");
                    largo=lector.nextDouble();
                }while(largo<0);
                do{
                    System.out.print("Ingrese ancho: ");
                    baseme=lector.nextDouble();
                }while(baseme<0);

                do{
                    System.out.print("Ingrese alto: ");
                    baseMA=lector.nextDouble();
                }while(baseMA<0);
                //
                Area=((2)*((largo*baseme)+(largo*baseMA)+(baseMA*baseme)));
                diametro=(Math.sqrt((largo*largo)+(baseMA*baseMA)+(baseme*baseme)));
                volumen=(largo*baseMA*baseme);
                //
                System.out.println("El area es de "+Area);
                System.out.println("El volumen es de "+volumen);
                System.out.println("El diametro es de "+diametro);
            }

            case 11->{
                System.out.println("Pirámide");
                double ApotemaBase, altura, ladosB, ApotemaB, ladoB;
                int nLados;
                int y=0;
                double ApotemaCara, PerimetroB, BaseA;
                double Volumen, AreaT, AreaL;
                do{
                    System.out.print("Ingrese el número de lados de la base: ");
                    nLados = lector.nextInt();
                }while(nLados<3);
                do{
                    System.out.print("Ingrese la altura de la pirámide: ");
                    altura = lector.nextDouble();
                }while(altura<0);

                System.out.println("Desea ingresar");
                System.out.println("1. Longitud del lado de la base");
                System.out.println("2. Longitud del apotema de la base");
                int seleccion = lector.nextInt();

                if(seleccion>=3){
                    do{
                        System.out.println("Opción inválida");
                        System.out.println("Elija una opción válida");
                        seleccion =lector.nextInt();
                        if(seleccion>=3){
                        y++;
                        }
                    }while(y<=0 || y>=3);
                }

                switch(seleccion){
                    case 1->{
                        do{
                            System.out.println("Ingrese longitud del lado de la base: ");
                            ladosB=lector.nextDouble();
                        }while(ladosB<0);
                        ApotemaB=((ladosB)/(2*Math.tan((Math.PI)/(nLados))));
                        ApotemaCara=(Math.sqrt((altura*altura)+(ApotemaB*ApotemaB)));
                        PerimetroB=(nLados*ladosB);
                        AreaL=(PerimetroB*ApotemaCara)/(2);
                        BaseA=(PerimetroB*ApotemaB)/(2);
                        AreaT=(AreaL+BaseA);
                        Volumen=(BaseA*altura)/(3);
                        //Mostrar los resultados
                        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
                        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
                        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
                    }

                    case 2->{
                        do{
                        System.out.println("Ingrese la longitud del apotema de la base: ");
                        ApotemaBase= lector.nextDouble(); 
                        }while(ApotemaBase<0);
                        ladoB=(2*ApotemaBase*(Math.tan((Math.PI)/(nLados))));
                        ApotemaCara=(Math.sqrt((altura*altura)+(ApotemaBase*ApotemaBase)));
                        PerimetroB=(nLados*ladoB);
                        AreaL=(PerimetroB*ApotemaCara)/(2);
                        BaseA=(PerimetroB*ApotemaBase)/(2);
                        AreaT=(AreaL+BaseA);
                        Volumen=(BaseA*altura)/(3);
                        //Mostrar los resultados
                        System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
                        System.out.println("Area total: " + AreaT + " unidades cuadradas.");
                        System.out.println("Volumen: " + Volumen + " unidades cubicas.");
                    }
                
                }
                }

            case 12->{
                System.out.println("Prisma");
                int cantidadLados;
                double longitudLados, altura, areaLateral,areaTotal,volumen;
                double perimetroBase, areaBase, apotema;

                do{
                    System.out.print("Cantidad de lados: ");
                    cantidadLados = lector.nextInt();
                }while(cantidadLados<0);
                do{
                    System.out.print("Altura: ");
                    altura = lector.nextDouble();
                }while(altura<0);
                do{
                    System.out.print("Longitud de los lados: ");
                    longitudLados = lector.nextDouble();
                }while(longitudLados<0);
                perimetroBase = cantidadLados * longitudLados;
                areaLateral = perimetroBase * altura;

                double alfa = (Math.PI/180) * (360/cantidadLados);
                apotema = longitudLados / (2 * Math.tan((alfa)/2));
                areaBase = (perimetroBase * apotema)/2;
                areaTotal = (areaLateral + 2) * areaBase;
                volumen = areaBase * altura;

                System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
                System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
                System.out.println("Volumen: " + volumen + " unidades cubicas.");
            }

            case 13->{
                System.out.println("Tetraedro");
                double largo;
                double hipotenusa, volumen, Area;

                do{
                    System.out.print("Ingrese el largo: ");
                    largo=lector.nextInt();
                }while(largo<0);
                //
                Area=((largo*largo)*Math.sqrt(3));
                hipotenusa=((largo)*((Math.sqrt(6))/(3)));
                volumen=(((Math.sqrt(2))/(12))*(largo*largo*largo));
                //
                System.out.println("El area es de "+Area);
                System.out.println("El volumen es de "+volumen);
                System.out.println("El hipotenusa es de "+hipotenusa);
            }

            case 14->{
                System.out.println("Tronco de cono");
                double altura, radiome, radioMa;
                double generatriz, AreaBMa, Areabme;
                double AreaL, AreaT, Volumen;
                //Espacio
                do{
                    System.out.print("Ingrese altura: ");
                    altura=lector.nextInt();
                }while(altura<0);
                do{
                    System.out.print("Ingrese radio menor ");
                    radiome=lector.nextInt();
                }while(radiome<0);
                do{
                    System.out.print("Ingrese radio mayor ");
                    radioMa=lector.nextInt();
                }while(radioMa<0);
                //Espacio
                generatriz=(Math.sqrt((altura*altura)+((radioMa-radiome)*(radioMa-radiome))));
                AreaL=((Math.PI*generatriz)*(radioMa+radiome));
                AreaBMa=(Math.PI*radioMa*radioMa);
                Areabme=(Math.PI*radiome*radiome);
                AreaT=(AreaL+AreaBMa+Areabme);
                Volumen=(((1/3)*(Math.PI*altura))*((radioMa*radioMa)+(radiome*radiome)+(radioMa*radiome)));
                ///Espacio
                System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
                System.out.println("Area total: " + AreaT + " unidades cuadradas.");
                System.out.println("Volumen: " + Volumen + " unidades cubicas.");
            }

            case 15->{
                System.out.println("Tronco de pirámide");
                double altura, ladosTMA, largoTme, ApotemaP;
                int ladosTme ,largoTMA;
                double PerimetroBMa, PerimetroBme, AreaBMA, AreaBme;
                double AreaL, AreaT, Volumen;
                //Espacio
                do{
                    System.out.println("Ingrese altura: ");
                    altura = lector.nextDouble();
                }while(altura<0);
                do{
                    System.out.println("Ingrese lados de la base mayor: ");
                    ladosTMA = lector.nextInt();
                }while(ladosTMA<0);
                do{
                    System.out.print("Ingrese lados de la base menor: ");
                    ladosTme = lector.nextInt();
                }while(ladosTme<0);
                do{
                    System.out.print("Ingrese el apotema de la piramide: ");
                    ApotemaP = lector.nextDouble();
                }while(ApotemaP<0);
                do{
                    System.out.println("Ingrese el largo de la base mayor: ");
                    largoTMA = lector.nextInt();
                }while(largoTMA<0);
                do{
                    System.out.print("Ingrese el largo de la base menor: ");
                    largoTme = lector.nextDouble();
                }while(largoTme<0);
                //
                PerimetroBMa=(ladosTMA*largoTMA);
                PerimetroBme=(ladosTme*largoTme);
                AreaL=(((PerimetroBMa+PerimetroBme)/(2))*(ApotemaP));
                AreaBMA=((PerimetroBMa*ApotemaP)/(2));
                AreaBme=((PerimetroBme*ApotemaP)/(2));
                AreaT=(AreaL+AreaBMA+AreaBme);
                Volumen=(((1/3)*altura)*(AreaBMA+AreaBme+Math.sqrt(AreaBMA*AreaBme)));
                //
                System.out.println("Area lateral: " + AreaL + " unidades cuadradas.");
                System.out.println("Area total: " + AreaT + " unidades cuadradas.");
                System.out.println("Volumen: " + Volumen + " unidades cubicas.");
            }

            case 16->{
                System.out.println("Zona esférica");
                double radioCH, radioGR, altura, radio;
                double volumen, area;
                do{
                    System.out.print("Ingrese la altura entre las radios: ");
                    altura = lector.nextInt();
                }while(altura<0);
                do{
                    System.out.print("Ingrese radio chiquita: ");
                    radioCH =lector.nextInt();
                }while(radioCH<0);
                do{
                    System.out.print("Ingrese radio grande ");
                    radioGR=lector.nextInt();
                }while(radioGR<0);
                do{
                    System.out.print("Ingrese radio: ");
                    radio =lector.nextInt();
                }while(radio<0);
                //separador
                volumen=(((Math.PI*altura)*((altura*altura)+(3*radioCH*radioCH)+(3*radioGR*radioGR)))/(6));
                area=(2*Math.PI*altura*radio);
                //ultimoSeparador
                System.out.println("El area es de: " + area);
                System.out.println("El volumen es de "+ volumen);
            }

        }
        
        System.out.println("FINALIZADO");

        lector.close();
    }
}
