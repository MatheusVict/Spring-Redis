package io.matheusvictor.springredis.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "ibge-ms", url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados")
public interface IBGE {

    @RequestMapping(method = RequestMethod.GET, value = "/{state}/municipios")
    List<IbgeResponse> findAllCities(@PathVariable String state);
}
