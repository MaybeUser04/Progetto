package Controller;

import Database.GestorePersistenza;
import Database.Session;
import Entity.Amministratore;
import Entity.Cliente;
import Entity.Ristoratore;

import java.util.List;

public class LoginController {

    public static boolean login(String email,String ruolo){

        boolean esito = false;
        if (ruolo.equalsIgnoreCase("Cliente")) {
            List<Cliente> c = new GestorePersistenza().cercaPerCampo(Cliente.class, "email", email);
            if (c.isEmpty()) {
                return esito;
            }
            Session.getInstance().setUtenteLoggato(c.getFirst());
            return true;
        } else if (ruolo.equalsIgnoreCase("Ristoratore")) {
            List<Ristoratore> r = new GestorePersistenza().cercaPerCampo(Ristoratore.class, "email", email);
            if (r.isEmpty()) {
                return esito;
            }
            Session.getInstance().setUtenteLoggato(r.getFirst());
            return  true;
        }else if(ruolo.equalsIgnoreCase("Amministratore")) {
            List<Amministratore> a = new GestorePersistenza().cercaPerCampo(Amministratore.class, "email", email);
            if (a.isEmpty()) {
                return esito;
            }
            Session.getInstance().setUtenteLoggato(a.getFirst());
            return true;
        }
        return false;
    }
}