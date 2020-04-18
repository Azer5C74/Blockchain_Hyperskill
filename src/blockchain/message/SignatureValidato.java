package blockchain.message;

  interface SignatureValidator {

    boolean verify(Message message)  throws Exception;
}