/**
 * 
 */
package com.albertocamillo.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Alberto Camillo
 *
 */
public class PasswordUtils
{

	public static String generatePassword(String password)
	{
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(password);
	}

	public static void main(String[] args)
	{
		System.out.println(generatePassword("admin"));
	}
}
