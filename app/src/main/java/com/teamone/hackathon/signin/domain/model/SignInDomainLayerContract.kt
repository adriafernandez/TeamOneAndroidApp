package com.teamone.hackathon.signin.domain.model


interface SignInDomainLayerContract {

    interface PresentationLayer {

        interface UseCase {

            interface LoginUser {

                suspend fun loginUser(): Result<Token?>

            }

        }
    }

    interface DataLayer {

        interface LoginRepository {

            suspend fun loginUser(): Result<Token>

        }
    }
}