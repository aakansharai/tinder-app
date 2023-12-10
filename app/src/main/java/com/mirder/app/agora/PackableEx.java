package com.mirder.app.agora;

public interface PackableEx extends Packable {
    void unmarshal(ByteBuf in);
}
