package de.laboranowitsch.apollon.uploadserver.loggingutils

import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger

interface LoggingAware

fun <T : LoggingAware> T.logger(): Logger = getLogger(javaClass)