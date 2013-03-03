package org.coreyjonoliver.glacier_cli

import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.auth.BasicAWSCredentials
import org.rogach.scallop.{Subcommand, ScallopConf}

object Main {

   def main(args: Array[String]) {
	   val conf = new ScallopConf(args) {
	     version("")
	     banner("")
	     footer("")
	     
	     val createVault = new Subcommand("create-vault") {
	       val vaultName = trailArg[String]("vault-name", "The vault name.", required = true)
	     }
	     
	     override def onError(e: Throwable) = {
	       println("Error: %s".format(e.getMessage))
	       printHelp()
	       sys.exit(1)
	     }
	   }
	   
	   conf.subcommand match {
	     case Some(conf.createVault) => {
	     }
	     case None => {}
	   }
   }
}




