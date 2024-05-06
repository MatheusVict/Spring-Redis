package io.matheusvictor.springredis.cloud;

import java.io.Serializable;

// needs serializable to won't receive cache errors in cache
public record IbgeResponse(int id, String nome) implements Serializable {
}
