#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package com.sample;

import java.io.IOException;
import java.math.BigInteger;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.ECKeyPair;
import org.web3j.model.HelloWorld;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.tx.gas.StaticGasProvider;

public class App {
        /** Note: Do NOT use this private key anywhere other than for demo purposes. */
        private static final String PRIVATE_KEY = "3585f81ae906512e3d28219e8fc62192661b13e7a15aa9bb9e2853ef8d9a2819";
        private final static BigInteger GAS_AMOUNT = BigInteger.valueOf(0);
        private final static BigInteger GAS_LIMIT = new BigInteger("1fffffffffffff", 16);

        public static void main(String[] args) throws Exception {
                System.out.println("Connecting to Hyperledger Besu...");
                Web3j web3j = Web3j.build(new HttpService("http://localhost:8545"));
                Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
                String clientVersion = web3ClientVersion.getWeb3ClientVersion();
                System.out.println("Connected to Hyperledger Besu: " + clientVersion);

                Credentials credentials = Credentials.create(PRIVATE_KEY);
                ContractGasProvider contractGasProvider = new StaticGasProvider(GAS_AMOUNT, GAS_LIMIT);
                
                System.out.println("Deploying contract...");
                HelloWorld contract = HelloWorld.deploy(web3j, credentials, contractGasProvider, "deploy").send();
                System.out.println("Deployed contract: " + contract.getContractAddress());

                System.out.println("Calling function on contract...");
                TransactionReceipt receipt = contract.update("Hello World!").send();
                System.out.println("Transaction: " + receipt.getTransactionHash());
                System.out.println("Message has been updated to: " + contract.message().send());

                System.exit(0);
        }

}
