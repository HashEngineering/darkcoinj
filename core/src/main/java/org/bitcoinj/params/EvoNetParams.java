/*
 * Copyright 2019 Dash Core Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bitcoinj.params;

public class EvoNetParams extends DevNetParams {

    /*
        connection parameters:
        https://dashplatform.readme.io/docs/tutorial-connecting-to-evonet-dash-core-full-node
     */
    public static String DEVNET_NAME = "evonet-5";
    public static String[] MASTERNODES = {
            "34.212.176.135",
            "34.220.50.187",
            "35.167.1.167",
            "34.222.46.203",
            "52.24.144.3",
            "18.237.78.167",
            "34.221.137.203",
            "54.188.167.159",
            "54.213.244.91",
            "35.166.6.110",
            "54.214.164.230",
            "52.10.63.195",
            "54.245.150.218",
            "34.209.42.117",
            "52.43.56.134",
            "52.26.203.151",
            "52.36.222.114",
            "34.217.19.154",
            "34.219.70.50",
            "34.220.78.165",
            "35.167.48.167",
            "34.219.251.242",
            "34.222.50.204",
            "54.201.41.131",
            "18.236.198.228",
            "34.216.14.190",
            "34.219.128.5",
            "54.190.26.164",
            "50.112.197.142",
            "34.220.63.84",
            "34.218.66.230",
            "52.33.172.246",
            "54.191.242.14",
            "34.221.55.32",
            "34.221.146.34",
            "54.212.9.170",
            "54.203.118.246",
            "18.236.165.125",
            "52.12.32.108",
            "54.187.122.146",
            "54.202.168.30",
            "52.89.124.211",
            "54.202.66.234",
            "35.162.228.3",
            "34.209.193.190",
            "34.222.243.95",
            "34.214.193.163",
            "34.219.137.212",
            "34.221.28.0",
            "52.13.98.99"
    };

    public EvoNetParams() {
        super(DEVNET_NAME, "yQuAu9YAMt4yEiXBeDp3q5bKpo7jsC2eEj", 20001, MASTERNODES, true, 70215);

        dnsSeeds = new String[]{
                "seed-1.evonet.networks.dash.org",
                "seed-2.evonet.networks.dash.org",
                "seed-3.evonet.networks.dash.org",
                "seed-4.evonet.networks.dash.org",
                "seed-5.evonet.networks.dash.org"
        };
    }

    private static EvoNetParams instance;

    public static EvoNetParams get() {
        if (instance == null) {
            instance = new EvoNetParams();
            add(instance);
        }
        return instance;
    }

    @Override
    public String[] getDefaultMasternodeList() {
        return MASTERNODES;
    }
}
