package ar.edu.tecnica29de6.turnos.service;

import ar.edu.tecnica29de6.turnos.model.Turno;
import ar.edu.tecnica29de6.turnos.repository.TurnoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TurnoService {

    @Autowired
    private TurnoRepository turnoRepository;

    public Turno asignarTurno(Turno turno) {
        turno.setCreacion(LocalDateTime.now());
        turno.setPendiente(1);
        turno.setLlamado(0);
        turno.setPuestoAtencionAsignado((int) (Math.random() * 10) + 1);  // Ejemplo: puesto aleatorio
        System.out.println("turno: "+turno);
        return turnoRepository.save(turno);
    }

    public List<Turno> obtenerFilaDeEspera() {
        return turnoRepository.findByPendiente(1);
    }

    public String atenderTurno(Long numeroTurno, int pendiente, int llamado) {
        Turno turno = turnoRepository.findById(numeroTurno).orElse(null);
        if (turno != null) {
            turno.setPendiente(pendiente);
            turno.setLlamado(llamado);
            turnoRepository.save(turno);
            return "OK";
        }
        return "ERROR";
    }

    public String cambiarPuestoAtencion(Long numeroTurno, int puestoAtencion) {
        Turno turno = turnoRepository.findById(numeroTurno).orElse(null);
        if (turno != null) {
            turno.setPuestoAtencionAsignado(puestoAtencion);
            turnoRepository.save(turno);
            return "OK";
        }
        return "ERROR";
    }
}
