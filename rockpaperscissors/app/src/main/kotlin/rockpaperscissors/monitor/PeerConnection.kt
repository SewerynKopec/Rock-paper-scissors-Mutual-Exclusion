package rockpaperscissors

import org.zeromq.SocketType;
import org.zeromq.ZMQ;
import org.zeromq.ZContext;
import org.zeromq.ZMQException;


class PeerConnection(
    var numOfPeers: Int,
    var port: String,
    var url: String = "localhost"
){

    constructor(){

    }
}