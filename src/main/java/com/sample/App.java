package com.sample;

import java.math.BigInteger;

import org.web3j.crypto.Credentials;
import org.web3j.crypto.ECKeyPair;
import org.web3j.model.HelloWorld;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.tx.gas.StaticGasProvider;

public class App {
        public static void main(String[] args) throws Exception {
                System.out.println("Starting web3server");

                Web3j web3j = Web3j.build(new HttpService("http://localhost:8545")); // defaults to
                                                                                     // http://localhost:8545/

                Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
                String clientVersion = web3ClientVersion.getWeb3ClientVersion();
                System.out.println("Connected to Hyperledger Besu: " + clientVersion);

                Credentials credentials = Credentials
                                .create("3585f81ae906512e3d28219e8fc62192661b13e7a15aa9bb9e2853ef8d9a2819");
                ContractGasProvider contractGasProvider = new StaticGasProvider(BigInteger.valueOf(0),
                                new BigInteger("1fffffffffffff", 16));

                System.out.println("Created gas provider: " + contractGasProvider.toString());

                HelloWorld contract = HelloWorld.deploy(web3j, credentials, contractGasProvider, "deploy").send();
                System.out.println("Deployed contract: " + contract.getContractAddress());
        }

}
