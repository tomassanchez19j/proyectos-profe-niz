public class Libro{
    private String titulo;
    private String autor;
    public void mostrarlibro(){
        System.out.print("el libro se llama: " + titulo +" del autor: "+ autor);
    }
    public void mostrartitulo(){
        System.out.print("el titulo es: " + titulo);
    }

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public Libro(String titulo){
        this.titulo = titulo;
    }
    public Libro(){

        
    }
}