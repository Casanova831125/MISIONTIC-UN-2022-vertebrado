public class GeneradorVertebrados {
    /**
     * @return
     */
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Vaca", "Mamifero");
        miVertebrados[2] = new Vertebrado("Perro", "Mamifero");
        miVertebrados[3] = new Vertebrado("Paloma","Ave");
        //miVertebrados[2] = new Vertebrado("Perro", "Mamifero"); 
        
        return miVertebrados;
    }
}
