package com.yechaoa.pictureselectordemo;

public interface ProgressRequestListener {
    void onRequestProgress(int pro, long contentLength, boolean done);
}
