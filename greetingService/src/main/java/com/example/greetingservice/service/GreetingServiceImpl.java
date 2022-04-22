package com.example.greetingservice.service;

import com.example.greetingservice.entity.PersonRecordEntity;
import com.example.greetingservice.repository.PersonRecordRepository;
import com.greet.GreetRequest;
import com.greet.GreetResponse;
import com.greet.GreetServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GrpcService
public class GreetingServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {
    @Autowired
    PersonRecordRepository personRecordRepository;

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        System.out.println("request.getId())>>>"+request.getId());
        Optional<PersonRecordEntity> personRecordEntity = personRecordRepository.findById(request.getId());
        responseObserver.onNext(GreetResponse.newBuilder().setResult(personRecordEntity.get().getFirstName()+">>>"+personRecordEntity.get().getLastName()).build());
        responseObserver.onCompleted();
    }
}
