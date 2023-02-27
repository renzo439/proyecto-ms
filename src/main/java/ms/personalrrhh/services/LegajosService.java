package ms.personalrrhh.services;

import ms.personalrrhh.model.ConsultaLegajos;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface LegajosService {
    ResponseEntity<ConsultaLegajos> getConsultaLegajos();
}
