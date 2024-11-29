import java.util.Date;

public class Main {
    public static void main(String[] args) {


        //Creacion del Evento
        Evento evento = new Evento(
                new Date(),
                "Auditorio Principal",
                "Concierto Anual",
                100,
                true,
                "Cultural",
                "15:00 - 18:00"
        );

        System.out.println("\nEvento creado: ");
        System.out.println("Nombre: " + evento.getNombre());
        System.out.println("Dirección: " + evento.getDireccion());
        System.out.println("Fecha: " + evento.getFecha());
        System.out.println("Tipo de evento: " + evento.getTipo());
        System.out.println("Cronograma: " + evento.getCronograma());
        System.out.println("Máximo de invitados: " + evento.getMaximoInvitados());
        System.out.println("¿Es para mayores? " + (evento.isEsParaMayores() ? "Sí" : "No"));
        System.out.println("----------------------------------------\n");


        //Creacion del Organizador

        Organizador organizador = new Organizador(
                "Maria",
                "Torres",
                "15445151",
                29,
                "mariatorresxd1@gmail.com"
        );

        System.out.println("Información del organizador: ");
        organizador.mostrarInformacion();

        //metodos de la clase Organizador
        System.out.println("\nInvocando métodos de la clase Organizador:");
        organizador.crearEvento();
        organizador.modificarEvento();
        organizador.gestionarEvento();
        System.out.println("----------------------------------------\n");


        //Creacion de las Invitaciones

        Invitacion invitacion1 = new Invitacion("VIP", "Participante");
        Invitacion invitacion2 = new Invitacion("General", "Espectador");


        //Creacion de Participantes

        Participante participante1 = new Participante("Luis", "Ramirez", "123456789", 30, invitacion1, evento);
        Participante participante2 = new Participante("Fernanda", "Rodriges", "987654321", 28, invitacion2, evento);

        //Agregar participantes al evento
        evento.agregarParticipante(participante1);
        evento.agregarParticipante(participante2);

        //Mostrar información de los participantes
        System.out.println("\nInformación de los participantes en el evento: ");
        evento.mostrarParticipantes();
        System.out.println("----------------------------------------\n");


        //Creacion y manejo de Guardia y Registro

        Registro registro = new Registro();
        registro.setInvitados("Luis, Fernanda, Maria");

        //Crear un guardia asociado al registro
        Guardia guardia = new Guardia("Carlos", "Salinas", "192837465", 40, "Entrada Principal", registro);

        //Mostrar informacion del guardia
        System.out.println("Información del guardia: ");
        guardia.mostrarInformacion();

        //Realizar la tarea de cuidar el lugar
        System.out.println("\nEl guardia está cuidando el lugar...");
        guardia.cuidarLugar();
        System.out.println("----------------------------------------\n");


        //Mostrar los invitados y las invitaciones

        System.out.println("Lista de invitados registrados en el evento: ");
        guardia.getRegistro().mostrarInvitados();

        System.out.println("\nLista de invitaciones asociadas al registro: ");
        guardia.getRegistro().mostrarInvitaciones();
        System.out.println("----------------------------------------\n");


        //Verificacion de invitados

        System.out.println("Verificación de invitados:");
        guardia.getRegistro().verificarInvitado("Juan");
        guardia.getRegistro().verificarInvitado("Laura");
        System.out.println("----------------------------------------\n");


        //Registrar un nuevo participante

        System.out.println("Registrando nuevo participante...");
        guardia.getRegistro().registrarParticipante("Laura");
        guardia.getRegistro().mostrarInvitados();
        System.out.println("----------------------------------------\n");
    }
}
