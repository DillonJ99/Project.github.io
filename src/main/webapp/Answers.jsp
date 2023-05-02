<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/EmailServer.css">
<style>
.answer {
	font-family: 'Russo One', sans-serif; color: black !important;
	font-size: 20px;
}

button {
	background-color: white;
	font-size: 20px;
	color: black;
	padding: 12px 20px;
	border-radius: 8px;
	cursor: pointer;
	display: block;
	margin-left: 0.8em;
	margin-top: 0.5em;
}

button:hover {
	background-color: red;
	color: white;
	cursor: pointer;
}
</style>
<title>Email Server</title>
</head>
<body>

	<h1>Phishing Email Server Answers</h1>

		<table>
			<tr>
				<th>Email Sender</th>
				<th>Email</th>
				<th>Answer (Yes for email's you think are Phishing and No for
					ones you think are real)</th>
			</tr>
			<tr>
				<td>Order Pending</td>
				<td><strong>Confirmation Needed</strong><br> Pleese click
					the link below to confirm purchase.</td>
				<td class="answer">Phishing</td>
			</tr>
			<tr>
				<td>Santander ${c.emailSender}</td>
				<td><strong>donotreply</strong> <br> Your new statement is
					ready to view</td>
				<td class="answer">Real</td>
			</tr>
			<tr>
				<td>PayPal</td>
				<td><strong>service@paypal.co.uk</strong> <br> Receipt for
					your payment to Dillon.</td>
				<td class="answer">Real</td>
			</tr>
			<tr>
				<td>Deliveroo </td>
				<td><strong> Hello,</strong> <br> Congratulations !!!
					You've been selected by Diliveroo Rewards Program</td>
				<td class="answer">Phishing</td>
			</tr>
			<tr>
				<td>Amazon</td>
				<td><strong>Your Amazon Account is Suspended - Confirm
						Your Information! </strong><br> Dear Amazon Customer, Your
					account has been temporarily suspended due to suspicious activity.
					To resolve this issue, please click the link below to confirm your
					account information and regain access.</td>
				<td class="answer">Phishing</td>
			</tr>
			<tr>
				<td>Uber Eats</td>
				<td><strong>Get 40% off your next 5 orders</strong> <br>
					40% off your next 5 orders when you spend £15 or more, maximum
					discount £12.*</td>
				<td class="answer">Real</td>
			</tr>
			<tr>
				<td>Netflix</td>
				<td><Strong>Update Payment Subscription - We can't
						authorize payment</strong> <br> Hi, Unfortunately, we cannot authorize
					your payment for the billing cycle of your subscription, Netflix
					was unable to receive a payment because the financial institution
					rejected the monthly charge.</td>
				<td class="answer">Phishing</td>
			</tr>
			<tr>
				<td>BBC Account</td>
				<td><strong>BBC password reset </strong><br> We got a
					request to reset your BBC account password. If that was you, please
					follow the link below:</td>
				<td class="answer">Real</td>
			</tr>
			<tr>
				<td>Google</td>
				<td><strong>Security alert</strong> <br> We noticed a new
					sign-in to your Google Account on a Windows device. If this was
					you, you don't need to do anything. If not, we'll help you secure
					your account.</td>
				<td class="answer">Real</td>
			</tr>
			<tr>
				<td>HSBC Advising Service</td>
				<td><strong>INCORRECT BANKING DETAILS</strong> <br> We
					have received an amount of USD28,948.12 from your we account and
					we don not know what this fund is for.</td>
				<td class="answer"> Phishing </td>
			</tr>
		</table>
		<button onclick="window.location.href='ThankYou.jsp'">End Test</button>
</body>
</html>