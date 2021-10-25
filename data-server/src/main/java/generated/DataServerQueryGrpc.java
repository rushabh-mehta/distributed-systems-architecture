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
    comments = "Source: data-server-query.proto")
public final class DataServerQueryGrpc {

  private DataServerQueryGrpc() {}

  public static final String SERVICE_NAME = "DataServerQuery";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.DataServerQueryOuterClass.query,
      generated.DataServerQueryOuterClass.result> getGetAllRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllRecords",
      requestType = generated.DataServerQueryOuterClass.query.class,
      responseType = generated.DataServerQueryOuterClass.result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.DataServerQueryOuterClass.query,
      generated.DataServerQueryOuterClass.result> getGetAllRecordsMethod() {
    io.grpc.MethodDescriptor<generated.DataServerQueryOuterClass.query, generated.DataServerQueryOuterClass.result> getGetAllRecordsMethod;
    if ((getGetAllRecordsMethod = DataServerQueryGrpc.getGetAllRecordsMethod) == null) {
      synchronized (DataServerQueryGrpc.class) {
        if ((getGetAllRecordsMethod = DataServerQueryGrpc.getGetAllRecordsMethod) == null) {
          DataServerQueryGrpc.getGetAllRecordsMethod = getGetAllRecordsMethod = 
              io.grpc.MethodDescriptor.<generated.DataServerQueryOuterClass.query, generated.DataServerQueryOuterClass.result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DataServerQuery", "getAllRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.DataServerQueryOuterClass.query.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.DataServerQueryOuterClass.result.getDefaultInstance()))
                  .setSchemaDescriptor(new DataServerQueryMethodDescriptorSupplier("getAllRecords"))
                  .build();
          }
        }
     }
     return getGetAllRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.DataServerQueryOuterClass.query,
      generated.DataServerQueryOuterClass.result> getGetSomeRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSomeRecords",
      requestType = generated.DataServerQueryOuterClass.query.class,
      responseType = generated.DataServerQueryOuterClass.result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.DataServerQueryOuterClass.query,
      generated.DataServerQueryOuterClass.result> getGetSomeRecordsMethod() {
    io.grpc.MethodDescriptor<generated.DataServerQueryOuterClass.query, generated.DataServerQueryOuterClass.result> getGetSomeRecordsMethod;
    if ((getGetSomeRecordsMethod = DataServerQueryGrpc.getGetSomeRecordsMethod) == null) {
      synchronized (DataServerQueryGrpc.class) {
        if ((getGetSomeRecordsMethod = DataServerQueryGrpc.getGetSomeRecordsMethod) == null) {
          DataServerQueryGrpc.getGetSomeRecordsMethod = getGetSomeRecordsMethod = 
              io.grpc.MethodDescriptor.<generated.DataServerQueryOuterClass.query, generated.DataServerQueryOuterClass.result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DataServerQuery", "getSomeRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.DataServerQueryOuterClass.query.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.DataServerQueryOuterClass.result.getDefaultInstance()))
                  .setSchemaDescriptor(new DataServerQueryMethodDescriptorSupplier("getSomeRecords"))
                  .build();
          }
        }
     }
     return getGetSomeRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.DataServerQueryOuterClass.dataEmpty,
      generated.DataServerQueryOuterClass.serverInfo> getGetServerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getServerInfo",
      requestType = generated.DataServerQueryOuterClass.dataEmpty.class,
      responseType = generated.DataServerQueryOuterClass.serverInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.DataServerQueryOuterClass.dataEmpty,
      generated.DataServerQueryOuterClass.serverInfo> getGetServerInfoMethod() {
    io.grpc.MethodDescriptor<generated.DataServerQueryOuterClass.dataEmpty, generated.DataServerQueryOuterClass.serverInfo> getGetServerInfoMethod;
    if ((getGetServerInfoMethod = DataServerQueryGrpc.getGetServerInfoMethod) == null) {
      synchronized (DataServerQueryGrpc.class) {
        if ((getGetServerInfoMethod = DataServerQueryGrpc.getGetServerInfoMethod) == null) {
          DataServerQueryGrpc.getGetServerInfoMethod = getGetServerInfoMethod = 
              io.grpc.MethodDescriptor.<generated.DataServerQueryOuterClass.dataEmpty, generated.DataServerQueryOuterClass.serverInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DataServerQuery", "getServerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.DataServerQueryOuterClass.dataEmpty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.DataServerQueryOuterClass.serverInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new DataServerQueryMethodDescriptorSupplier("getServerInfo"))
                  .build();
          }
        }
     }
     return getGetServerInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataServerQueryStub newStub(io.grpc.Channel channel) {
    return new DataServerQueryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataServerQueryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataServerQueryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataServerQueryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataServerQueryFutureStub(channel);
  }

  /**
   */
  public static abstract class DataServerQueryImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllRecords(generated.DataServerQueryOuterClass.query request,
        io.grpc.stub.StreamObserver<generated.DataServerQueryOuterClass.result> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllRecordsMethod(), responseObserver);
    }

    /**
     */
    public void getSomeRecords(generated.DataServerQueryOuterClass.query request,
        io.grpc.stub.StreamObserver<generated.DataServerQueryOuterClass.result> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSomeRecordsMethod(), responseObserver);
    }

    /**
     */
    public void getServerInfo(generated.DataServerQueryOuterClass.dataEmpty request,
        io.grpc.stub.StreamObserver<generated.DataServerQueryOuterClass.serverInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServerInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.DataServerQueryOuterClass.query,
                generated.DataServerQueryOuterClass.result>(
                  this, METHODID_GET_ALL_RECORDS)))
          .addMethod(
            getGetSomeRecordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.DataServerQueryOuterClass.query,
                generated.DataServerQueryOuterClass.result>(
                  this, METHODID_GET_SOME_RECORDS)))
          .addMethod(
            getGetServerInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.DataServerQueryOuterClass.dataEmpty,
                generated.DataServerQueryOuterClass.serverInfo>(
                  this, METHODID_GET_SERVER_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class DataServerQueryStub extends io.grpc.stub.AbstractStub<DataServerQueryStub> {
    private DataServerQueryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataServerQueryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServerQueryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataServerQueryStub(channel, callOptions);
    }

    /**
     */
    public void getAllRecords(generated.DataServerQueryOuterClass.query request,
        io.grpc.stub.StreamObserver<generated.DataServerQueryOuterClass.result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSomeRecords(generated.DataServerQueryOuterClass.query request,
        io.grpc.stub.StreamObserver<generated.DataServerQueryOuterClass.result> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSomeRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServerInfo(generated.DataServerQueryOuterClass.dataEmpty request,
        io.grpc.stub.StreamObserver<generated.DataServerQueryOuterClass.serverInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServerInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DataServerQueryBlockingStub extends io.grpc.stub.AbstractStub<DataServerQueryBlockingStub> {
    private DataServerQueryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataServerQueryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServerQueryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataServerQueryBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.DataServerQueryOuterClass.result getAllRecords(generated.DataServerQueryOuterClass.query request) {
      return blockingUnaryCall(
          getChannel(), getGetAllRecordsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.DataServerQueryOuterClass.result getSomeRecords(generated.DataServerQueryOuterClass.query request) {
      return blockingUnaryCall(
          getChannel(), getGetSomeRecordsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.DataServerQueryOuterClass.serverInfo getServerInfo(generated.DataServerQueryOuterClass.dataEmpty request) {
      return blockingUnaryCall(
          getChannel(), getGetServerInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataServerQueryFutureStub extends io.grpc.stub.AbstractStub<DataServerQueryFutureStub> {
    private DataServerQueryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataServerQueryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServerQueryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataServerQueryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.DataServerQueryOuterClass.result> getAllRecords(
        generated.DataServerQueryOuterClass.query request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllRecordsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.DataServerQueryOuterClass.result> getSomeRecords(
        generated.DataServerQueryOuterClass.query request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSomeRecordsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.DataServerQueryOuterClass.serverInfo> getServerInfo(
        generated.DataServerQueryOuterClass.dataEmpty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServerInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RECORDS = 0;
  private static final int METHODID_GET_SOME_RECORDS = 1;
  private static final int METHODID_GET_SERVER_INFO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataServerQueryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataServerQueryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_RECORDS:
          serviceImpl.getAllRecords((generated.DataServerQueryOuterClass.query) request,
              (io.grpc.stub.StreamObserver<generated.DataServerQueryOuterClass.result>) responseObserver);
          break;
        case METHODID_GET_SOME_RECORDS:
          serviceImpl.getSomeRecords((generated.DataServerQueryOuterClass.query) request,
              (io.grpc.stub.StreamObserver<generated.DataServerQueryOuterClass.result>) responseObserver);
          break;
        case METHODID_GET_SERVER_INFO:
          serviceImpl.getServerInfo((generated.DataServerQueryOuterClass.dataEmpty) request,
              (io.grpc.stub.StreamObserver<generated.DataServerQueryOuterClass.serverInfo>) responseObserver);
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

  private static abstract class DataServerQueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataServerQueryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.DataServerQueryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataServerQuery");
    }
  }

  private static final class DataServerQueryFileDescriptorSupplier
      extends DataServerQueryBaseDescriptorSupplier {
    DataServerQueryFileDescriptorSupplier() {}
  }

  private static final class DataServerQueryMethodDescriptorSupplier
      extends DataServerQueryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataServerQueryMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataServerQueryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataServerQueryFileDescriptorSupplier())
              .addMethod(getGetAllRecordsMethod())
              .addMethod(getGetSomeRecordsMethod())
              .addMethod(getGetServerInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
