package quizz;

import java.util.*;

public class FirstDraft {

	public static void main(String[] args) {

		askQuestionFromAllChapters();
	}

	public static List<String> quizzQuestions() {

		ArrayList<String> intrebari = new ArrayList<>();
		intrebari.add("What's the purpose of the Application Layer ?");
		intrebari.add("What's the function of the Presentation Layer ?");
		intrebari.add("What's the function of the Session Layer ?");
		intrebari.add("What's the difference between Services and Protocols ?");
		intrebari.add("Explain the Client/Server Model");
		intrebari.add("Explain the P2P Networks");
		intrebari.add("Explain the P2P Applications");
		intrebari.add("Give examples of Services and their Ports");
		intrebari.add("How is DNS working ?");
		intrebari.add("What kind of messages can a Client can send to a Server ?");
		intrebari.add("Explain the SMPT/POP Protocols");
		intrebari.add("What are the e-mail server processes ? Explain MTA and MDA");
		intrebari.add("Explain the FTP Protocol");
		intrebari.add("Explain the DHCP Protocol");
		intrebari.add("Explain  the File-Sharing Services & SMB Protocol");
		intrebari.add("What is  Telnet ? How does it work ?");
		intrebari.add("What are the functions of the Transport Layer ?");
		intrebari.add("What are the responsabilities of the Transport Layer ? Explain");
		intrebari.add("UDP and TCP - What are the differences between them");
		intrebari.add("How many types of Ports are ? Give examples");
		intrebari.add("What is a Socket ?");
		intrebari.add("What makes TCP a reliable protocol ?");
		intrebari.add("Explain the 3 Way Handshake Method");
		intrebari.add("TCP Session Termination - Explain the 2 Way Handshake Method");
		intrebari.add("What is Expectational ACK ?");
		intrebari.add("Explain the Retransmission Process");
		intrebari.add("What is Flow Control ?");
		intrebari.add("Why isnt't UDP a reliable protocol ?");
		intrebari.add("Explain the process of Reassembly for UDP");
		intrebari.add("UDP Client processes - What ports do they use ?");
		intrebari.add("What are the functions of the Network Layer ?");
		intrebari.add("Explain each function of the Network Layer");
		intrebari.add("What are the characteristics of IPv4 - Detail them");
		intrebari.add("How can networks be grouped ?");
		intrebari.add("Describe the Subnetting process");
		intrebari.add("What is a Gateway ?");
		intrebari.add("What are the 3 main features of Routes ?");
		intrebari.add("What is a Hop ?");
		intrebari.add("Which address is the Default Route ?");
		intrebari.add("Types of Routing");
		intrebari.add("Give examples of Routing Protocols");
		intrebari.add("Describe the process of forwarding a packet to its destination");
		intrebari.add("How many parts does an IPv4 address has ?");
		intrebari.add("Convert and IPv4 address into binary");
		intrebari.add("What types of communication exist in an IPv4 network? Describe them");
		intrebari.add("How can a person tell which bits of an address are network bits and which ones are host bits ?");
		intrebari.add("How can a device tell which bits of an address are network bits and which ones are host bits ?");
		intrebari.add("Which address is the Broadcast address ?");
		intrebari.add("What special unicast IPv4 addresses exist ? Describe them");
		intrebari.add("Explain the Static and Dynamic assigning of addresses ");
		intrebari.add("ISP Tiers - describe them");
		intrebari.add("What is AND process and why is it used ?");
		intrebari.add("How can 2 or more subnets be created ?");
		intrebari.add("What is Tracert ?");
		intrebari.add("What is RTT ?");
		intrebari.add("What is TTL ?");
		intrebari.add("ICMP messages - Describe them");
		intrebari.add("What are the functions of Data Link Layer ?");
		intrebari.add("What could happen with a Frame at router's interface level ?");
		intrebari.add("What is a node ?");
		intrebari.add("What does a Frame include ?");
		intrebari.add("What are the fields of a Frame ?");
		intrebari.add("How many sublayers does Data Link Layer has ? Describe them");
		intrebari.add("Explain the MAC methods for Shared Media");
		intrebari.add("Explain the MAC methods for Non-Shared Media");
		intrebari.add("What is Full and Half Duplex communications ?");
		intrebari.add("What are the differeces between Physical and Logical topologies ?");
		intrebari.add("Explain the P2P, Multiaccess and Rind topologies ");
		intrebari.add("What are the parts of a Frame ? Explain them");
		intrebari.add("Give examples of Protocols for Data Link layer ");
		intrebari.add("Explain the Ethernet protocol for LAN");
		intrebari.add("Explain the PPP for WAN");
		intrebari.add("Explain the Wirelss for LAN");
		intrebari.add("Explain the road of a packet through the Internetwork");
		intrebari.add("What is the purpose of the Physical Layer ?");
		intrebari.add("What are the elements of Frames' Delivery ?");
		intrebari.add("What are the Standards for Physical Layer ?");
		intrebari.add("What is a Bit Time ?");
		intrebari.add("How many variations of a signal are ?");
		intrebari.add("Explain the Nonreturn to Zero method");
		intrebari.add("Explain the Manchester method");
		intrebari.add("What is  'code groups' ?");
		intrebari.add("Which are the 3 data-carrying methods ? Explain each");
		intrebari.add("Explain the Copper Media - give examples of cables ");
		intrebari.add("Explain the UTP, Coax, HFC and STP cables");
		intrebari.add("Explain the Fiber Media");
		intrebari.add("What are the types of FO cables ?");
		intrebari.add("Explain the Wirelss Media");
		intrebari.add("What are the WLAN devices ? ");
		intrebari.add("What are the media connectors for FO and what issues can be encountered ?");

		Collections.shuffle(intrebari);

		return intrebari;

	}

	@SuppressWarnings("resource")
	public static void askQuestionFromAllChapters() {

		int numberOfQuestions = quizzQuestions().size();

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < numberOfQuestions; i++) {
			System.out.println("--------------------");
			System.out.println("Ready for your first question ? Type yes/y when ready");

			String answer = input.nextLine();

			if (answer.toLowerCase().contains("y")) {

				System.out.println("Question: " + "*" + quizzQuestions().get(i) + "*");
			} else
				System.out.println("test");
		}
	}
}
