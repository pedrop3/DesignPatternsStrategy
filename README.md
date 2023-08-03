<a name="readme-top"></a>






<!-- PROJECT LOGO -->
<br />
<div align="center">
  <!-- <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a> -->

  <h3 align="center">Design Patterns -Strategy - Factory</h3>

</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <!-- <li><a href="#roadmap">Roadmap</a></li> -->
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

Problem: Payment Processing System

Imagine that you are working for a company that processes online payments for various clients. This company deals with different payment methods such as Credit Card, PayPal, and Bank Transfer.

Each payment method has specific logic for processing payments:

Credit Card Payment:

The user enters credit card details, such as the card number, expiration date, and security code.
The system verifies if the details are valid and if there's sufficient balance on the card to complete the transaction.
PayPal Payment:

The user is redirected to the PayPal page to log in to their account.
The system receives confirmation from PayPal if the user's authentication is successful and then checks if there's enough balance to complete the transaction.
Bank Transfer Payment:

The user enters bank account details, such as the account number and bank code.
The system validates the bank data and confirms the transaction with the user's bank.
Additionally, for each payment method, there's also the possibility of processing payments in different currencies, such as USD, EUR, GBP, among others.

Your task is to create a payment processing system using the Factory and Strategy design pattern that allows for flexible and easy payment processing, handling different payment methods and currencies.


### Built With


* Spring boot


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->

### Prerequisites

* Java 17
* Maven 

### Installation

_Below is an example of how you can instruct your audience on installing and setting up your app. This template doesn't rely on any external dependencies or services._

1. Clone the repo
   ```sh
   git clone https://github.com/pedrop3/circuit-breaker-client.git
   ```
2. Install dependencs
   ```sh
   mvn clean install compile
   ```
4. If you're using Visual Studio Code, you can simply run the project by configuring the `launch.json`


<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
<!-- ## Usage

To effectively demonstrate the Circuit Breaker in action, please run both services. The main service consumes resources from the secondary service. You can use the `circuit-breaker.postman_collection.json` file to make the API requests like "patients/2". 

If the secondary service doesn't respond correctly within the Circuit Breaker's defined rules, the state will be altered, for this stop the service "circuit-breaker-client" 

To monitor the state transitions, you can use the "/actuator/health" endpoint. The main service should continue to function without causing significant issues for the end client.

<p align="right">(<a href="#readme-top">back to top</a>)</p> -->



<!-- ROADMAP
## Roadmap

- [x] Add Changelog
- [x] Add back to top links
- [ ] Add Additional Templates w/ Examples
- [ ] Add "components" document to easily copy & paste sections of the readme
- [ ] Multi-language Support
    - [ ] Chinese
    - [ ] Spanish

See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p> -->



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License.
<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Linkedin: [https://www.linkedin.com/in/pedrohmsantos/](https://www.linkedin.com/in/pedrohmsantos/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



