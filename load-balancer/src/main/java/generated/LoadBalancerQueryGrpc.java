package generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: load-balancer-query.proto")
public final class LoadBalancerQueryGrpc {

  private LoadBalancerQueryGrpc() {}

  public static final String SERVICE_NAME = "LoadBalancerQuery";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.LoadBalancerQueryOuterClass.query,
      generated.LoadBalancerQueryOuterClass.result> getGetAllRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllRecords",
      requestType = generated.LoadBalancerQueryOuterClass.query.class,
      responseType = generated.LoadBalancerQueryOuterClass.result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.LoadBalancerQueryOuterClass.query,
      generated.LoadBalancerQueryOuterClass.result> getGetAllRecordsMethod() {
    io.grpc.MethodDescriptor<generated.LoadBalancerQueryOuterClass.query, generated.LoadBalancerQueryOuterClass.result> getGetAllRecordsMethod;
    if ((getGetAllRecordsMethod = LoadBalancerQueryGrpc.getGetAllRecordsMethod) == null) {
      synchronized (LoadBalancerQueryGrpc.class) {
        if ((getGetAllRecordsMethod = LoadBalancerQueryGrpc.getGetAllRecordsMethod) == null) {
          LoadBalancerQueryGrpc.getGetAllRecordsMethod = getGetAllRecordsMethod = 
              io.grpc.MethodDescriptor.<generated.LoadBalancerQueryOuterClass.query, generated.LoadBalancerQueryOuterClass.result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LoadBalancerQuery", "getAllRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.LoadBalancerQueryOuterClass.query.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.LoadBalancerQueryOuterClass.result.getDefaultInstance()))
                  .setSchemaDescriptor(new LoadBalancerQueryMethodDescriptorSupplier("getAllRecords"))
                  .build();
          }
        }
     }
     return getGetAllRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.LoadBalancerQueryOuterClass.query,
      generated.LoadBalancerQueryOuterClass.result> getGetSomeRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSomeRecords",
      requestType = generated.LoadBalancerQueryOuterClass.query.class,
      responseType = generated.LoadBalancerQueryOuterClass.result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.LoadBalancerQueryOuterClass.query,
      generated.LoadBalancerQueryOuterClass.result> getGetSomeRecordsMethod() {
    io.grpc.MethodDescriptor<generated.LoadBalancerQueryOuterClass.query, generated.LoadBalancerQueryOuterClass.result> getGetSomeRecordsMethod;
    if ((getGetSomeRecordsMethod = LoadBalancerQueryGrpc.getGetSomeRecordsMethod) == null) {
      synchronized (LoadBalancerQueryGrpc.class) {
        if ((getGetSomeRecordsMethod = LoadBalancerQueryGrpc.getGetSomeRecordsMethod) == null) {
          LoadBalancerQueryGrpc.getGetSomeRecordsMethod = getGetSomeRecordsMethod = 
              io.grpc.MethodDescriptor.<generated.LoadBalancerQueryOuterClass.query, generated.LoadBalancerQueryOuterClass.result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LoadBalancerQuery", "getSomeRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.LoadBalancerQueryOuterClass.query.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.LoadBalancerQueryOuterClass.result.getDefaultInstance()))
                  .setSchemaDescriptor(new LoadBalancerQueryMethodDescriptorSupplier("getSomeRecords"))
                  .build();
          }
        }
     }
     return getGetSomeRecordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoadBalancerQueryStub newStub(io.grpc.Channel channel) {
    return new LoadBalancerQueryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoadBalancerQueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LoadBalancerQueryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoadBalancerQueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LoadBalancerQueryFutureStub(channel);
  }

  /**
   */
  public static abstract class LoadBalancerQueryImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllRecords(generated.LoadBalancerQueryOuterClass.query request,
        io.grpc.stub.StreamObserver<generated.LoadBalancerQueryOuterClass.result> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllRecordsMethod(), responseObserver);
    }

    /**
     */
    public void getSomeRecords(generated.LoadBalancerQueryOuterClass.query request,
        io.grpc.stub.StreamObserver<generated.LoadBalancerQueryOuterClass.result> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSomeRecordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.LoadBalancerQueryOuterClass.query,
                generated.LoadBalancerQueryOuterClass.result>(
                  this, METHODID_GET_ALL_RECORDS)))
          .addMethod(
            getGetSomeRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.LoadBalancerQueryOuterClass.query,
                generated.LoadBalancerQueryOuterClass.result>(
                  this, METHODID_GET_SOME_RECORDS)))
          .build();
    }
  }

  /**
   */
  public static final class LoadBalancerQueryStub extends io.grpc.stub.AbstractStub<LoadBalancerQueryStub> {
    private LoadBalancerQueryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoadBalancerQueryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoadBalancerQueryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoadBalancerQueryStub(channel, callOptions);
    }

    /**
     */
    public void getAllRecords(generated.LoadBalancerQueryOuterClass.query request,
        io.grpc.stub.StreamObserver<generated.LoadBalancerQueryOuterClass.result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSomeRecords(generated.LoadBalancerQueryOuterClass.query request,
        io.grpc.stub.StreamObserver<generated.LoadBalancerQueryOuterClass.result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSomeRecordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LoadBalancerQueryBlockingStub extends io.grpc.stub.AbstractStub<LoadBalancerQueryBlockingStub> {
    private LoadBalancerQueryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoadBalancerQueryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoadBalancerQueryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoadBalancerQueryBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.LoadBalancerQueryOuterClass.result getAllRecords(generated.LoadBalancerQueryOuterClass.query request) {
      return blockingUnaryCall(
          getChannel(), getGetAllRecordsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.LoadBalancerQueryOuterClass.result getSomeRecords(generated.LoadBalancerQueryOuterClass.query request) {
      return blockingUnaryCall(
          getChannel(), getGetSomeRecordsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LoadBalancerQueryFutureStub extends io.grpc.stub.AbstractStub<LoadBalancerQueryFutureStub> {
    private LoadBalancerQueryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoadBalancerQueryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoadBalancerQueryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoadBalancerQueryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.LoadBalancerQueryOuterClass.result> getAllRecords(
        generated.LoadBalancerQueryOuterClass.query request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllRecordsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.LoadBalancerQueryOuterClass.result> getSomeRecords(
        generated.LoadBalancerQueryOuterClass.query request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSomeRecordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RECORDS = 0;
  private static final int METHODID_GET_SOME_RECORDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoadBalancerQueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoadBalancerQueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_RECORDS:
          serviceImpl.getAllRecords((generated.LoadBalancerQueryOuterClass.query) request,
              (io.grpc.stub.StreamObserver<generated.LoadBalancerQueryOuterClass.result>) responseObserver);
          break;
        case METHODID_GET_SOME_RECORDS:
          serviceImpl.getSomeRecords((generated.LoadBalancerQueryOuterClass.query) request,
              (io.grpc.stub.StreamObserver<generated.LoadBalancerQueryOuterClass.result>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LoadBalancerQueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoadBalancerQueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.LoadBalancerQueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoadBalancerQuery");
    }
  }

  private static final class LoadBalancerQueryFileDescriptorSupplier
      extends LoadBalancerQueryBaseDescriptorSupplier {
    LoadBalancerQueryFileDescriptorSupplier() {}
  }

  private static final class LoadBalancerQueryMethodDescriptorSupplier
      extends LoadBalancerQueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoadBalancerQueryMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LoadBalancerQueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoadBalancerQueryFileDescriptorSupplier())
              .addMethod(getGetAllRecordsMethod())
              .addMethod(getGetSomeRecordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
