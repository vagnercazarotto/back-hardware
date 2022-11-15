package com.ucs.hardware.hardwaredata.resource;


import com.ucs.hardware.hardwaredata.data.IRepo;
import com.ucs.hardware.hardwaredata.model.Amostragem;
import com.ucs.hardware.hardwaredata.model.AmostragemEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class OpenEndpointResource {

    @Autowired
    IRepo repo;

    @Operation(summary = "EndPoint to store data into database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "Accepted operation, in work ...",
                    content = {@Content(mediaType = "application/json", schema = @Schema())}),
            @ApiResponse(responseCode = "400", description = "Invalid request, check VIN and Shop ID",
                    content = @Content)})
    @PostMapping(path = "/storedata")
    @CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
    public AmostragemEntity salvarLeitura(@RequestBody Amostragem request) {

        AmostragemEntity amostragem = new AmostragemEntity();

        amostragem.setTensao(request.getTensao());
        amostragem.setCorrente(request.getCorrente());

        repo.save(amostragem);

        return amostragem;
    }



    @Operation(summary = "EndPoint to store data into database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "Accepted operation, in work ...",
                    content = {@Content(mediaType = "application/json", schema = @Schema())}),
            @ApiResponse(responseCode = "400", description = "Invalid request, check VIN and Shop ID",
                    content = @Content)})
    @GetMapping(path = "/getData")
    @CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
    public List<AmostragemEntity> salvarLeitura() {



        return repo.selectAll();
    }
}
