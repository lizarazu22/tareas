package Practica3.Ejercicio4Proxy;

import Practica2.Ejercicio5Mediator.User;

import java.util.LinkedList;
import java.util.List;

public class Proxy implements  ICluster{
    private Servidor1 servidor1;
    private Servidor2 servidor2;
    private List<Usuario> usuarios;

    public Proxy(Servidor1 servidor1, Servidor2 servidor2) {
        usuarios = new LinkedList<Usuario>();
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
    }
    public void register(int usuario, String nombre, String nickname, String password){
        usuarios.add(new Usuario(usuario, nombre, nickname, password));
    }

    @Override
    public void brindarAtencion(int usuario, String password) {
        for (Usuario user : usuarios) {
            if (user.getNumUsuario() == usuario && user.getPassword().equals(password)) {
                if (user.getNumUsuario() % 2 == 0) {
                    servidor1.brindarAtencion(usuario, password);
                    user.showInfo();
                } else {
                    servidor2.brindarAtencion(usuario, password);
                    user.showInfo();
                }
            }
        }
    }
}
