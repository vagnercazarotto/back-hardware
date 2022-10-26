package com.ucs.hardware.hardwaredata.resource;


import com.ucs.hardware.hardwaredata.model.Amostragem;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class OpenEndpointResource {

    @Operation(summary = "EndPoint to store data into database")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "202", description = "Accepted operation, in work ...",
                    content = {@Content(mediaType = "application/json", schema = @Schema())}),
            @ApiResponse(responseCode = "400", description = "Invalid request, check VIN and Shop ID",
                    content = @Content)})
    @PostMapping(path = "/storedata")
    @CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
    public ResponseEntity<Amostragem> createToken(@RequestBody Amostragem request) {

        return null;
    }
}
