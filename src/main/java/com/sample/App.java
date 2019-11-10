package com.sample;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

public class App {
	public static void main(String[] args) throws Exception {
                System.out.println( "Starting web3server" );

                Web3j web3j = Web3j.build(new HttpService("http://localhost:8545"));  // defaults to http://localhost:8545/

                Web3ClientVersion web3ClientVersion = web3j.web3ClientVersion().send();
                String clientVersion = web3ClientVersion.getWeb3ClientVersion();
                System.out.println("Connected to Hyperledger Besu: " + clientVersion);
	}

}
