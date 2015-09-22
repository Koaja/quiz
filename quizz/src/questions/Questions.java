package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Questions {

	public Questions() {

	}

	public static List<String> chapter3Questions() {

		ArrayList<String> chapter3 = new ArrayList<>();
		chapter3.add("What's the purpose of the Application Layer ?");
		chapter3.add("What's the function of the Presentation Layer ?");
		chapter3.add("What's the function of the Session Layer ?");
		chapter3.add("What's the difference between Services and Protocols ?");
		chapter3.add("Explain the Client/Server Model");
		chapter3.add("Explain the P2P Networks");
		chapter3.add("Explain the P2P Applications");
		chapter3.add("Give examples of Services and their Ports");
		chapter3.add("How is DNS working ?");
		chapter3.add("What kind of messages can a Client can send to a Server ?");
		chapter3.add("Explain the SMPT/POP Protocols");
		chapter3.add("What are the e-mail server processes ? Explain MTA and MDA");
		chapter3.add("Explain the FTP Protocol");
		chapter3.add("Explain the DHCP Protocol");
		chapter3.add("Explain  the File-Sharing Services & SMB Protocol");
		chapter3.add("What is  Telnet ? How does it work ?");

		Collections.shuffle(chapter3);

		return chapter3;
	}

	public static List<String> chapter4Questions() {

		ArrayList<String> chapter4 = new ArrayList<>();
		chapter4.add("What are the functions of the Transport Layer ?");
		chapter4.add("What are the responsabilities of the Transport Layer ? Explain");
		chapter4.add("UDP and TCP - What are the differences between them");
		chapter4.add("How many types of Ports are ? Give examples");
		chapter4.add("What is a Socket ?");
		chapter4.add("What makes TCP a reliable protocol ?");
		chapter4.add("Explain the 3 Way Handshake Method");
		chapter4.add("TCP Session Termination - Explain the 2 Way Handshake Method");
		chapter4.add("What is Expectational ACK ?");
		chapter4.add("Explain the Retransmission Process");
		chapter4.add("What is Flow Control ?");
		chapter4.add("Why isnt't UDP a reliable protocol ?");
		chapter4.add("Explain the process of Reassembly for UDP");
		chapter4.add("UDP Client processes - What ports do they use ?");

		Collections.shuffle(chapter4);

		return chapter4;
	}

	public static List<String> chapter5Questions() {

		ArrayList<String> chapter5 = new ArrayList<>();

		chapter5.add("What are the functions of the Network Layer ?");
		chapter5.add("Explain each function of the Network Layer");
		chapter5.add("What are the characteristics of IPv4 - Detail them");
		chapter5.add("How can networks be grouped ?");
		chapter5.add("Describe the Subnetting process");
		chapter5.add("What is a Gateway ?");
		chapter5.add("What are the 3 main features of Routes ?");
		chapter5.add("What is a Hop ?");
		chapter5.add("Which address is the Default Route ?");
		chapter5.add("Types of Routing");
		chapter5.add("Give examples of Routing Protocols");
		chapter5.add("Describe the process of forwarding a packet to its destination");

		Collections.shuffle(chapter5);

		return chapter5;
	}

	public static List<String> chapter6Questions() {

		ArrayList<String> chapter6 = new ArrayList<>();
		chapter6.add("How many parts does an IPv4 address has ?");
		chapter6.add("Convert and IPv4 address into binary");
		chapter6.add("What types of communication exist in an IPv4 network? Describe them");
		chapter6.add("How can a person tell which bits of an address are network bits and which ones are host bits ?");
		chapter6.add("How can a device tell which bits of an address are network bits and which ones are host bits ?");
		chapter6.add("Which address is the Broadcast address ?");
		chapter6.add("What special unicast IPv4 addresses exist ? Describe them");
		chapter6.add("Explain the Static and Dynamic assigning of addresses ");
		chapter6.add("ISP Tiers - describe them");
		chapter6.add("What is AND process and why is it used ?");
		chapter6.add("How can 2 or more subnets be created ?");
		chapter6.add("What is Tracert ?");
		chapter6.add("What is RTT ?");
		chapter6.add("What is TTL ?");
		chapter6.add("ICMP messages - Describe them");

		Collections.shuffle(chapter6);

		return chapter6;
	}

	public static List<String> chapter7Questions() {

		ArrayList<String> chapter7 = new ArrayList<>();

		chapter7.add("What are the functions of Data Link Layer ?");
		chapter7.add("What could happen with a Frame at router's interface level ?");
		chapter7.add("What is a node ?");
		chapter7.add("What does a Frame include ?");
		chapter7.add("What are the fields of a Frame ?");
		chapter7.add("How many sublayers does Data Link Layer has ? Describe them");
		chapter7.add("Explain the MAC methods for Shared Media");
		chapter7.add("Explain the MAC methods for Non-Shared Media");
		chapter7.add("What is Full and Half Duplex communications ?");
		chapter7.add("What are the differeces between Physical and Logical topologies ?");
		chapter7.add("Explain the P2P, Multiaccess and Rind topologies ");
		chapter7.add("What are the parts of a Frame ? Explain them");
		chapter7.add("Give examples of Protocols for Data Link layer ");
		chapter7.add("Explain the Ethernet protocol for LAN");
		chapter7.add("Explain the PPP for WAN");
		chapter7.add("Explain the Wirelss for LAN");
		chapter7.add("Explain the road of a packet through the Internetwork");

		// Collections.shuffle(chapter7);

		return chapter7;
	}

	public static List<String> chapter8Questions() {

		ArrayList<String> chapter8 = new ArrayList<>();

		chapter8.add("What is the purpose of the Physical Layer ?");
		chapter8.add("What are the elements of Frames' Delivery ?");
		chapter8.add("What are the Standards for Physical Layer ?");
		chapter8.add("What is a Bit Time ?");
		chapter8.add("How many variations of a signal are ?");
		chapter8.add("Explain the Nonreturn to Zero method");
		chapter8.add("Explain the Manchester method");
		chapter8.add("What is  'code groups' ?");
		chapter8.add("Which are the 3 data-carrying methods ? Explain each");
		chapter8.add("Explain the Copper Media - give examples of cables ");
		chapter8.add("Explain the UTP, Coax, HFC and STP cables");
		chapter8.add("Explain the Fiber Media");
		chapter8.add("What are the types of FO cables ?");
		chapter8.add("Explain the Wirelss Media");
		chapter8.add("What are the WLAN devices ? ");
		chapter8.add("What are the media connectors for FO and what issues can be encountered ?");

		Collections.shuffle(chapter8);

		return chapter8;
	}

	public static List<String> AllChaptersQuestions() {

		ArrayList<String> allChapters = new ArrayList<>();
		allChapters.add("What's the purpose of the Application Layer ?");
		allChapters.add("What's the function of the Presentation Layer ?");
		allChapters.add("What's the function of the Session Layer ?");
		allChapters.add("What's the difference between Services and Protocols ?");
		allChapters.add("Explain the Client/Server Model");
		allChapters.add("Explain the P2P Networks");
		allChapters.add("Explain the P2P Applications");
		allChapters.add("Give examples of Services and their Ports");
		allChapters.add("How is DNS working ?");
		allChapters.add("What kind of messages can a Client can send to a Server ?");
		allChapters.add("Explain the SMPT/POP Protocols");
		allChapters.add("What are the e-mail server processes ? Explain MTA and MDA");
		allChapters.add("Explain the FTP Protocol");
		allChapters.add("Explain the DHCP Protocol");
		allChapters.add("Explain  the File-Sharing Services & SMB Protocol");
		allChapters.add("What is  Telnet ? How does it work ?");
		allChapters.add("What are the functions of the Transport Layer ?");
		allChapters.add("What are the responsabilities of the Transport Layer ? Explain");
		allChapters.add("UDP and TCP - What are the differences between them");
		allChapters.add("How many types of Ports are ? Give examples");
		allChapters.add("What is a Socket ?");
		allChapters.add("What makes TCP a reliable protocol ?");
		allChapters.add("Explain the 3 Way Handshake Method");
		allChapters.add("TCP Session Termination - Explain the 2 Way Handshake Method");
		allChapters.add("What is Expectational ACK ?");
		allChapters.add("Explain the Retransmission Process");
		allChapters.add("What is Flow Control ?");
		allChapters.add("Why isnt't UDP a reliable protocol ?");
		allChapters.add("Explain the process of Reassembly for UDP");
		allChapters.add("UDP Client processes - What ports do they use ?");
		allChapters.add("What are the functions of the Network Layer ?");
		allChapters.add("Explain each function of the Network Layer");
		allChapters.add("What are the characteristics of IPv4 - Detail them");
		allChapters.add("How can networks be grouped ?");
		allChapters.add("Describe the Subnetting process");
		allChapters.add("What is a Gateway ?");
		allChapters.add("What are the 3 main features of Routes ?");
		allChapters.add("What is a Hop ?");
		allChapters.add("Which address is the Default Route ?");
		allChapters.add("Types of Routing");
		allChapters.add("Give examples of Routing Protocols");
		allChapters.add("Describe the process of forwarding a packet to its destination");
		allChapters.add("How many parts does an IPv4 address has ?");
		allChapters.add("Convert and IPv4 address into binary");
		allChapters.add("What types of communication exist in an IPv4 network? Describe them");
		allChapters
				.add("How can a person tell which bits of an address are network bits and which ones are host bits ?");
		allChapters
				.add("How can a device tell which bits of an address are network bits and which ones are host bits ?");
		allChapters.add("Which address is the Broadcast address ?");
		allChapters.add("What special unicast IPv4 addresses exist ? Describe them");
		allChapters.add("Explain the Static and Dynamic assigning of addresses ");
		allChapters.add("ISP Tiers - describe them");
		allChapters.add("What is AND process and why is it used ?");
		allChapters.add("How can 2 or more subnets be created ?");
		allChapters.add("What is Tracert ?");
		allChapters.add("What is RTT ?");
		allChapters.add("What is TTL ?");
		allChapters.add("ICMP messages - Describe them");
		allChapters.add("What are the functions of Data Link Layer ?");
		allChapters.add("What could happen with a Frame at router's interface level ?");
		allChapters.add("What is a node ?");
		allChapters.add("What does a Frame include ?");
		allChapters.add("What are the fields of a Frame ?");
		allChapters.add("How many sublayers does Data Link Layer has ? Describe them");
		allChapters.add("Explain the MAC methods for Shared Media");
		allChapters.add("Explain the MAC methods for Non-Shared Media");
		allChapters.add("What is Full and Half Duplex communications ?");
		allChapters.add("What are the differeces between Physical and Logical topologies ?");
		allChapters.add("Explain the P2P, Multiaccess and Rind topologies ");
		allChapters.add("What are the parts of a Frame ? Explain them");
		allChapters.add("Give examples of Protocols for Data Link layer ");
		allChapters.add("Explain the Ethernet protocol for LAN");
		allChapters.add("Explain the PPP for WAN");
		allChapters.add("Explain the Wirelss for LAN");
		allChapters.add("Explain the road of a packet through the Internetwork");
		allChapters.add("What is the purpose of the Physical Layer ?");
		allChapters.add("What are the elements of Frames' Delivery ?");
		allChapters.add("What are the Standards for Physical Layer ?");
		allChapters.add("What is a Bit Time ?");
		allChapters.add("How many variations of a signal are ?");
		allChapters.add("Explain the Nonreturn to Zero method");
		allChapters.add("Explain the Manchester method");
		allChapters.add("What is  'code groups' ?");
		allChapters.add("Which are the 3 data-carrying methods ? Explain each");
		allChapters.add("Explain the Copper Media - give examples of cables ");
		allChapters.add("Explain the UTP, Coax, HFC and STP cables");
		allChapters.add("Explain the Fiber Media");
		allChapters.add("What are the types of FO cables ?");
		allChapters.add("Explain the Wirelss Media");
		allChapters.add("What are the WLAN devices ? ");
		allChapters.add("What are the media connectors for FO and what issues can be encountered ?");

		Collections.shuffle(allChapters);

		return allChapters;

	}

}