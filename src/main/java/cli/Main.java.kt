package com.example.apisecscanner.cli

import com.example.apisecscanner.core.ApiScanner

object Main {
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        val scanner = ApiScanner()
        if (args.size > 0) {
            scanner.scan(args[0])
        } else {
            println("Usage: java -jar apisec-scanner.jar <API_URL>")
        }
    }
}