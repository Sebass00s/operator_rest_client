package ar.edu.tecnica29de6.turnos.controller;

import ar.edu.tecnica29de6.turnos.model.Turno;
import ar.edu.tecnica29de6.turnos.service.TurnoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/turnos")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @PostMapping("/asignar")
    public Turno asignarTurno(@RequestBody Turno turno) {
        return turnoService.asignarTurno(turno);
    }

    @GetMapping("/fila")
    public List<Turno> obtenerFilaDeEspera() {
    //public List<Turno> getFila() {
    //public String getFila() {
    	System.out.println("obtenerFilaDeEspera()");
        return turnoService.obtenerFilaDeEspera();
    }


    @PutMapping("/atender")
    public String atenderTurno(@RequestBody Turno turno) {
        return turnoService.atenderTurno(turno.getNumeroTurno(), turno.getPendiente(), turno.getLlamado());
    }

    @PutMapping("/cambiar-puesto")
    public String cambiarPuesto(@RequestBody Turno turno) {
        return turnoService.cambiarPuestoAtencion(turno.getNumeroTurno(), turno.getPuestoAtencionAsignado());
    }
}
