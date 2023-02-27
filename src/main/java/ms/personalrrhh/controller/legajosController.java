package ms.personalrrhh.controller;

import lombok.RequiredArgsConstructor;
import ms.personalrrhh.LegajosApi;
import ms.personalrrhh.model.ConsultaLegajos;
import ms.personalrrhh.services.LegajosService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class legajosController implements LegajosApi {

    private final LegajosService service;

    @Override
    public ResponseEntity<ConsultaLegajos> getConsultaLegajos(String idLegajos) {
        return LegajosApi.super.getConsultaLegajos(idLegajos);
    }
}
