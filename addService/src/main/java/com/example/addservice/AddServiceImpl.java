package com.example.addservice;

import com.example.add.AddRequest;
import com.example.add.AddResponse;
import com.example.add.AddServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class AddServiceImpl extends AddServiceGrpc.AddServiceImplBase{

    @Override
    public void add(AddRequest request, StreamObserver<AddResponse> responseObserver) {
        responseObserver.onNext(AddResponse.newBuilder().setResult(request.getA()+request.getB()).build());
        responseObserver.onCompleted();
    }
}
