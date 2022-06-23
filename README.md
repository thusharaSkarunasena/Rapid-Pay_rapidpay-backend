# Rapid Pay - RapidPay Backend API

## Description
This is the backend of the 'Rapid Pay' project which is developed as a utility bill payment platform.
Rapidpay backend API is used to manage users and keep track of utility bill payment details.
API is hosted to 'Heroku' & API endpoints are not secured.

## Technologies Used
* Spring Boot
* PostgreSQL

## API Demo Url
[https://rapidpay-be.herokuapp.com](https://rapidpay-be.herokuapp.com/)
	
## API Endpoints
	/rapidpay_user/getAllRapidpayUsers
	/rapidpay_user/getRapidpayUser/{id}
	/rapidpay_user/checkRapidpayUser/{email}
	/rapidpay_user/saveRapidpayUser
	/rapidpay_user/updateRapidpayUser
	/rapidpay_user/deleteRapidpayUser/{id}
	
	/rapidpay_payment/getAllRapidpayPayments
	/rapidpay_payment/getAllRapidpayPaymentsByUserId/{id}
	/rapidpay_payment/getRapidpayPayment/{id}
	/rapidpay_payment/saveRapidpayPayment
	/rapidpay_payment/updateRapidpayPayment
	/rapidpay_payment/deleteRapidpayPayment/{id}
