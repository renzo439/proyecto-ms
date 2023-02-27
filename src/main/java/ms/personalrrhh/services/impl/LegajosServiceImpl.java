package ms.personalrrhh.services.impl;

import ms.personalrrhh.model.ConsultaLegajos;
import ms.personalrrhh.services.LegajosService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LegajosServiceImpl implements LegajosService {

    @Override
    public ResponseEntity<ConsultaLegajos> getConsultaLegajos() {
        return null;
    }
}
